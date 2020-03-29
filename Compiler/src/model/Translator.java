package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.statement.MultiAssignment;
import model.statement.assignment.Expression;
import model.statement.assignment.ExpressionAssignment;
import model.statement.assignment.expression.Logical;
import model.statement.assignment.expression.ParanthesesExpression;
import model.statement.assignment.expression.Relational;
import model.statement.assignment.expression.arithmetic.Addition;
import model.statement.assignment.expression.arithmetic.Division;
import model.statement.assignment.expression.arithmetic.IntegerConstant;
import model.statement.assignment.expression.arithmetic.IntegerVariable;
import model.statement.assignment.expression.arithmetic.Modulo;
import model.statement.assignment.expression.arithmetic.Multiplication;
import model.statement.assignment.expression.arithmetic.Subtraction;
import model.statement.assignment.expression.lambda.ForAll;
import model.statement.assignment.expression.logical.BooleanConstant;
import model.statement.assignment.expression.logical.BooleanVariable;
import model.statement.assignment.expression.logical.Conjunction;
import model.statement.assignment.expression.logical.Disjunction;
import model.statement.assignment.expression.logical.Equivalence;
import model.statement.assignment.expression.logical.Implication;
import model.statement.assignment.expression.logical.Negation;
import model.statement.assignment.expression.relational.Equality;
import model.statement.assignment.expression.relational.GreaterThan;
import model.statement.assignment.expression.relational.GreaterThanOrEqual;
import model.statement.assignment.expression.relational.Inequality;
import model.statement.assignment.expression.relational.LessThan;
import model.statement.assignment.expression.relational.LessThanOrEqual;
import model.statement.conditional.AssertedConditional;
import model.statement.conditional.ElseIfStatement;
import model.statement.conditional.IfElseIfStatement;
import model.statement.conditional.PostcondStatement;
import model.statement.conditional.PrecondStatement;

public class Translator implements Visitor {

	private int ifStatementsTranslated;				// current number of if statements translated

	private String finalResult;						// Contains the result of translation
	
	private List<String> result;					// Container to store the results after a visit
	
	private Map<String, String> resultMap;			// Container to store the results after a visit

	private Map<String, String> originalToAlloy;	// container to hold the variable name mapping 
													// from their original names to their alloy names 
	private String trueInAlloy;						

	private String falseInAlloy;

	public Translator() {
		finalResult = "";
		falseInAlloy = "False";
		trueInAlloy = "True";
		ifStatementsTranslated = 0;
		result = new ArrayList<>();
		resultMap = new HashMap<>();
		originalToAlloy = new HashMap<>();
	}

	public Translator(Map<String, String> originalToAlloy) {
		finalResult = "";
		falseInAlloy = "False";
		trueInAlloy = "True";
		ifStatementsTranslated = 0;
		result = new ArrayList<>();
		resultMap = new HashMap<>();
		this.originalToAlloy = originalToAlloy;
	}


	/**
	 * @return the statementsTranslated
	 */
	private void incrementStatementsTranslated() {
		ifStatementsTranslated++;
	}

	/**
	 * @return the statementsTranslated
	 */
	private int getStatementsTranslated() {
		return ifStatementsTranslated;
	}

	/**
	 * @return the result
	 */
	private List<String> getResult() {
		return result;
	}

	/**
	 * @return the resultMap
	 */
	private Map<String, String> getResultMap() {
		return resultMap;
	}

	/**
	 * @return the originalToAlloy
	 */
	private Map<String, String> getOriginalToAlloy() {
		return originalToAlloy;
	}

	/**
	 * @return the finalResult
	 */
	public String getFinalResult() {
		return finalResult;
	}
	
	/**
	 * Helper function to get the names of all additional variables used in Alloy
	 * that correspond to a specific variable in the input language it calculates
	 * the result by finding all possible variable names between names of parameter
	 * val and parameter largestVal
	 * @param val String representing the initial corresponding name for a variable
	 * @param largestVal representing the final version of the name for the 
	 * corresponding variable
	 * @return List of String that represent the names of the variables in Alloy
	 * 
	 * For Example: val="arg1", largestVal="arg1'''" return=["arg1'","arg1''","arg1'''"] 
	**/
	public List<String> listOfVariablesUsed(String val, String largestVal){
		List<String> result = new ArrayList<>();
		if (largestVal.equals(val)){
			return result;
		}
		
		while(largestVal.startsWith(val) && !largestVal.equals(val)){
			val += "'";
			result.add(val);
		}
		return result;
	}

	@Override
	public void visitConditionalAssertionStatement(AssertedConditional exp) {
		String predName = "predIfStatement";
		String assertName = "assertIfStatement";
		Map<String, Value> vars = exp.getVariables();

		StringBuilder predParamSB = new StringBuilder();
		StringBuilder forAllParamSB = new StringBuilder();
		StringBuilder forSomeParamSB = new StringBuilder();
		StringBuilder predInputParamSB = new StringBuilder();
		
		Map<String, String> preOriginalToAlloy = new HashMap<>();
		Map<String, String> postOriginalToAlloy = new HashMap<>();

		int counter = 1;
		for (String each : vars.keySet()) {
			if(!each.contains("_old")){
				String alloyVar = "arg" + (counter);
				String originalVar = each;						
				preOriginalToAlloy.put(originalVar, alloyVar);
				System.out.println("// " + originalVar + " => " +alloyVar );
				counter++;				
			}
		}
		
		Translator precondTranslator = new Translator(preOriginalToAlloy);
		exp.getPreCond().accept(precondTranslator);
		List<String> precondTranslated = precondTranslator.getResult();
		StringBuilder precondSB = new StringBuilder();
		precondSB.append("((");
		precondTranslated.forEach(precondSB::append);
		precondSB.append(")");
		precondSB.append(" in True");
		precondSB.append(") ");
		String precondTranslatedString = precondSB.toString();

		
		Translator functionTranslator = new Translator(preOriginalToAlloy); // might change map values
		exp.getIfStatment().accept(functionTranslator);
		List<String> functionTranslated = functionTranslator.getResult();
		StringBuilder functionSB = new StringBuilder();
		functionTranslated.forEach(functionSB::append);
		String functionTranslatedString = functionSB.toString();

		
		for(String key: functionTranslator.getResultMap().keySet() ){
			postOriginalToAlloy.put(key + "_old", preOriginalToAlloy.get(key));
			postOriginalToAlloy.put(key , functionTranslator.getResultMap().get(key));
		}
		
		System.out.println("originalToAlloy Update Values: " + functionTranslator.getResultMap().toString());
		System.out.println("preOriginalToAlloy    Values: " + preOriginalToAlloy.toString());
		System.out.println("postOriginalToAlloy    Values: " + postOriginalToAlloy.toString());
		
		Translator postcondTranslator = new Translator(postOriginalToAlloy);
		exp.getPostCond().accept(postcondTranslator);
		List<String> postcondTranslated = postcondTranslator.getResult();
		StringBuilder postcondSB = new StringBuilder();
		postcondSB.append("((");
		postcondTranslated.forEach(postcondSB::append);
		postcondSB.append(")");
		postcondSB.append(" in True");
		postcondSB.append(") ");
		String postcondTranslatedString = postcondSB.toString();


		for (String key : preOriginalToAlloy.keySet()) {
			String originalVar = key;
			String alloyVar = preOriginalToAlloy.get(key);
			String varType = vars.get(originalVar).getType();
			List<String> remainingVars = listOfVariablesUsed(alloyVar,functionTranslator.getResultMap().get(key));
			
			predParamSB.append(alloyVar);
			for(String each : remainingVars){
				predParamSB.append(",").append(each);
			}
			predParamSB.append(":").append(varType).append(",");
			
			forAllParamSB.append(alloyVar).append(":").append(varType).append(",");
			for(String each : remainingVars){
				forSomeParamSB.append(each).append(":").append(varType).append(",");
			}
			
			predInputParamSB.append(alloyVar).append(",");
			for(String each : remainingVars){
				predInputParamSB.append(each).append(",");
			}

		}
		
		predParamSB.deleteCharAt(predParamSB.lastIndexOf(","));
		forAllParamSB.deleteCharAt(forAllParamSB.lastIndexOf(","));
		if(forSomeParamSB.length()>0){
			forSomeParamSB.deleteCharAt(forSomeParamSB.lastIndexOf(","));	
		}
		predInputParamSB.deleteCharAt(predInputParamSB.lastIndexOf(","));
		
		
		StringBuilder predSignitureSB = new StringBuilder();
		predSignitureSB.append("pred ").append(predName).append(ifStatementsTranslated);
		predSignitureSB.append(" [").append(predParamSB).append("] {\n");
		predSignitureSB.append("\t").append(functionTranslatedString).append(" \n\t");
		predSignitureSB.append(postcondTranslatedString).append("\t\t\t // post condition\n}\n\n");
		
		
		this.finalResult = predSignitureSB.toString();
		
		StringBuilder assertSB = new StringBuilder();
		assertSB.append("check ").append(assertName).append(ifStatementsTranslated).append(" {\n");
		assertSB.append("\t { all ").append(forAllParamSB).append(" |  ");
		if (forSomeParamSB.length()>0){
			assertSB.append("some ").append(forSomeParamSB).append(" | ");	
		}
		assertSB.append(precondTranslatedString).append(" => ").append(predName).append(ifStatementsTranslated).append("[");
		assertSB.append(predInputParamSB).append("] }").append("\n}\n");

		this.finalResult += assertSB.toString();
		
		this.incrementStatementsTranslated();
	}
	
	/**
	 * Helper function to update the values in the given map. It goes through all the keys until it
	 * finds a key with a value that is a prefix of the given newValue and replaces that value with
	 * the newValue 
	 * @param originalToAlloy Map<String,String>  maps the original names to their alloy counterparts
	 * @param newValue String representing the new value to replace the original value  
	 * 
	 * For Example: originalToAlloy={"x":"arg1","y":"arg2"} newValue="arg2'''" => Map={"x":"arg1","y":"arg2'''"}  
	**/
	private void originalToAlloyUpdateValues (Map<String, String> originalToAlloy, String newValue) {
		for(String key:originalToAlloy.keySet()){
			if(newValue.startsWith(originalToAlloy.get(key))){
				originalToAlloy.put(key, newValue);
				break;
			}
		}
	}
	

	/**
	 * Helper function to update the value of the keys in the givenMapping map based
	 * on their largest updated values in the newMapping map  
	 * @param givenMapping Map<String,String> the values of which will be updated   
	 * @param newMapping Map<String,String> that contains the new values for mapping
	 * 
	 * For Example: givenMapping={"x":"arg1","y":"arg2"}, newMapping={"arg1'":"3",
	 * "arg1''":"5","arg2'":"13","arg2''":"1","arg2'''":"31"} 
	 * => (After updateMapping is done) givenMapping={"x":"arg1''","y":"arg2'''"}
	**/
	public void updateToLargestMapping(Map<String, String> givenMapping, Map<String, String> newMapping) {
		for (String key : newMapping.keySet()) {
			originalToAlloyUpdateValues(givenMapping, key);
		}
	}
	
	/**
	 * Helper function that returns a map containing the missing assignments for variables
	 * used in the postcondition statement  
	 * @param originalToAlloy Map<String,String> maps the original names to their alloy counterparts
	 * @param alloyAssignments Map<String,String> maps the original names to their alloy counterparts
	 * used in a specific multiassignment body
	 * @param originalToLargesAlloy Map<String,String> maps the original names to their alloy counterparts
	 * in the all if/elseif/els statement bodies (for a specific if statement)   
	 * 
	 * For Example: originalToAlloy={"x":"arg1","y":"arg2"}, alloyAssignments={"arg1'":"3",
	 * ,"arg2'":"13"} and originalToLargesAlloy = {"x":"arg1'","y":"arg2'''"}
	 * => result = {"arg1'''","arg1'"}
	**/
	public Map<String, String> largestValueMap(Map<String, String> originalToAlloy, Map<String, String> alloyAssignments, Map<String, String> originalToLargesAlloy) {
		Map<String, String> result = new HashMap<>();
		for (String key : originalToAlloy.keySet()) {
			String alloyValue = originalToAlloy.get(key);
			String largestAlloyRunning = alloyValue;
			for(String newAlloyValue : alloyAssignments.keySet()){
				if (newAlloyValue.startsWith(alloyValue) && newAlloyValue.length()>largestAlloyRunning.length()){
					largestAlloyRunning = newAlloyValue;
				}
			}
			if(originalToLargesAlloy.get(key).compareTo(largestAlloyRunning)>0){
				result.put(originalToLargesAlloy.get(key),largestAlloyRunning);
			}
		}
		return result;
	}
	

	@Override
	public void visitIfConditional(IfElseIfStatement exp) {
		Translator conditionTranslator = new Translator(originalToAlloy);
		exp.getCondition().accept(conditionTranslator);

		Translator ifTranslator = new Translator(originalToAlloy);
		exp.getAssignments().accept(ifTranslator);
				
		// Parse ElseIf if there is any 	
		List<List<String>> elseIfConditions = new ArrayList<>();
		List<Map<String,String>> elseIfAssignments = new ArrayList<>();
		for ( ElseIfStatement stmt : exp.getElseIfStatments()){
			Translator elseIfTranslator = new Translator(originalToAlloy);
			stmt.accept(elseIfTranslator);
			elseIfConditions.add(elseIfTranslator.getResult());
			elseIfAssignments.add(elseIfTranslator.getResultMap());
		}
		assert(elseIfAssignments.size()==elseIfConditions.size());
		
		Translator elseTranslator = new Translator(originalToAlloy);
		if (exp.getElseStatment() != null) {
			exp.getElseStatment().getAssignments().accept(elseTranslator);
		}

		this.resultMap.putAll(originalToAlloy);
		
		System.out.println("getOriginalToAlloy: " + this.getOriginalToAlloy().toString());
		System.out.println("If Updates: " + ifTranslator.resultMap.toString());
		System.out.println("ElseIf conditions: " + elseIfConditions.toString());
		System.out.println("ElseIf  Updates: " + elseIfAssignments.toString());
		System.out.println("Else Updates: " + elseTranslator.resultMap.toString());

		updateToLargestMapping(this.resultMap,ifTranslator.getResultMap());
		for(int i=0;i<elseIfAssignments.size();i++){
			updateToLargestMapping(this.resultMap,elseIfAssignments.get(i));
		}
		updateToLargestMapping(this.resultMap,elseTranslator.getResultMap());

		System.out.println("in if ToAlloy Update Values: " + this.resultMap.toString());

		
		this.result.add("((");
		this.result.addAll(conditionTranslator.getResult());
		this.result.add(") in True)");
		this.result.add(" => ");
		this.result.add("\n\t\t");
		this.result.add(" (("+ trueInAlloy +") in True)");
		for (String key : ifTranslator.getResultMap().keySet()) {
			this.result.add(" and ");
			this.result.add(key);
			this.result.add("=");
			this.result.add(ifTranslator.getResultMap().get(key));
		}
		Map<String,String> missingAssignments = largestValueMap(this.originalToAlloy,ifTranslator.getResultMap(),this.resultMap);
		System.out.println("If missingAssignments: " + missingAssignments.toString());
		for (String key:missingAssignments.keySet()){
			this.result.add(" and ");
			this.result.add(key);
			this.result.add("=");
			this.result.add(missingAssignments.get(key));
		}
		
		for(int i=0;i<elseIfConditions.size();i++){
			this.result.add("\n\telse");
			this.result.add(" (( ");
			this.result.addAll(elseIfConditions.get(i));
			this.result.add(" ) in True) ");
			this.result.add(" => ");
			this.result.add("\n\t\t");
			this.result.add(" (("+ trueInAlloy +") in True)");
			for (String key : elseIfAssignments.get(i).keySet()) {
				this.result.add(" and ");
				this.result.add(key);
				this.result.add("=");
				this.result.add(elseIfAssignments.get(i).get(key));
			}
			missingAssignments = largestValueMap(this.originalToAlloy,elseIfAssignments.get(i),this.resultMap);
			System.out.println("else If missingAssignments: " + missingAssignments.toString());
			for (String key:missingAssignments.keySet()){
				this.result.add(" and ");
				this.result.add(key);
				this.result.add("=");
				this.result.add(missingAssignments.get(key));
			}
		}		
		
		if(exp.getElseStatment() != null){
			this.result.add("\n\telse \n\t\t");
			for (String key : elseTranslator.getResultMap().keySet()) {
				this.result.add(key);
				this.result.add("=");
				this.result.add(elseTranslator.getResultMap().get(key));
				this.result.add(" and ");
			}
			
			missingAssignments = largestValueMap(this.originalToAlloy,elseTranslator.getResultMap(),this.resultMap);
			System.out.println("else missingAssignments: " + missingAssignments.toString());
			for (String key:missingAssignments.keySet()){
				this.result.add(key);
				this.result.add("=");
				this.result.add(missingAssignments.get(key));
				this.result.add(" and ");
			}
			
			this.result.remove(this.result.size()-1);
		}
	}

	@Override
	public void visitElseIfConditional(ElseIfStatement exp) {
		Translator conditionTranslator = new Translator(originalToAlloy);
		exp.getCondition().accept(conditionTranslator);
		this.result.addAll(conditionTranslator.getResult());
		
		Translator assignmentTranslator = new Translator(originalToAlloy);
		exp.getAssignments().accept(assignmentTranslator );
		this.resultMap.putAll(assignmentTranslator.getResultMap());
	}
	
	/**
	 * Helper function to update the values in the given list with their corresponding 
	 * keys (which represent their updated values) in the given map and converts it to
	 * string
	 * @param origOutput list of strings to be updated
	 * @param updates Map<String,String> that maps keys to their corresponding new values
	 * 
	 * For Example: origOutput=["x","+","y","-","5"]   updates={"x":"arg1'",y="arg2''"}
	 * result = "arg1'+arg2''-5" 
	**/
	private String updateToString(List<String> origOutput, Map<String,String> updates){
		StringBuilder result = new StringBuilder();
		for(String str:origOutput){
			if(updates.containsKey(str)){
				result.append(updates.get(str));	
			} else {
				result.append(str);
			}
		}
		return result.toString();
	}
	
	@Override
	public void visitMultipleAssignments(MultiAssignment exp) {
		// Must be in the body of if/else statement
		Map<String,String> originalToOriginal = new HashMap<>();
		Map<String,String> lhsOfUpdates = new HashMap<>();
		Map<String,String> rhsOfUpdates = new HashMap<>();
		
		for(String key:originalToAlloy.keySet()){
			originalToOriginal.put(key,key);
		}
		for(String key:originalToAlloy.keySet()){
			lhsOfUpdates.put(key,originalToAlloy.get(key)+"'");
		}
		for(String key:originalToAlloy.keySet()){
			rhsOfUpdates.put(key,originalToAlloy.get(key));
		}
		for (Instruction inst : exp.getAssignments()) {
			if (inst instanceof Expression){
				// Skip non assignments as they don't mean anything in Alloy
				// if not skipped then this translation will be converted to 
				// be a fact in Alloy due to "and"ing
				continue;
			}
			Translator instTranslator = new Translator(originalToOriginal);
			inst.accept(instTranslator);
			
			List<String> lhsList = new ArrayList<>();
			lhsList.add(instTranslator.getResult().get(0));
			List<String> rhsList = new ArrayList<>();
			for(int i=1;i<instTranslator.getResult().size();i++){
				rhsList.add(instTranslator.getResult().get(i));	
			}
			assert(lhsList.size()==1);
			
//			System.out.println("lhs List: " + lhsList.toString());
//			System.out.println("lhs Updates: " + lhsOfUpdates.toString());
//			System.out.println("rhs List: " + rhsList.toString());
//			System.out.println("rhs Updates: " + rhsOfUpdates.toString());
			
			String lhs = updateToString(lhsList, lhsOfUpdates);
			String rhs = updateToString(rhsList, rhsOfUpdates);
//			System.out.println("Lhs String: " + lhs);
//			System.out.println("rhs String: " + rhs);
			this.resultMap.put(lhs, rhs);
			lhsOfUpdates.put(lhsList.get(0),lhsOfUpdates.get(lhsList.get(0))+"'");
			rhsOfUpdates.put(lhsList.get(0),lhs);
		}
		System.out.println("rhs Updates: " + rhsOfUpdates.toString());
	}

	public void visitAssignExpression(ExpressionAssignment exp) {
		String alloyVarName = this.originalToAlloy.get(exp.getID());
		this.result.add(alloyVarName);
		Translator rhsTranslator = new Translator(originalToAlloy);
		exp.getExpr().accept(rhsTranslator);
		this.result.addAll(rhsTranslator.getResult());
	}

	@Override
	public void visitParanthesesExpression(ParanthesesExpression exp) {
		Translator innerTranslator = new Translator(originalToAlloy);
		exp.getExpression().accept(innerTranslator);
		result = innerTranslator.getResult();
	}

	@Override
	public void visitDivisionArithmetic(Division exp) {
		Translator lhsTranslator = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTranslator);

		result.addAll(lhsTranslator.getResult());
		result.add(".div[");
		result.addAll(rhsTranslator.getResult());
		result.add("]");
	}


	@Override
	public void visitModuloArithmetic(Modulo exp) {
		Translator lhsTranslator = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTranslator);

		result.addAll(lhsTranslator.getResult());
		result.add(".rem[");
		result.addAll(rhsTranslator.getResult());
		result.add("]");
	}

	@Override
	public void visitMultiplicationArithmetic(Multiplication exp) {
		Translator lhsTranslator = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTranslator);

		result.addAll(lhsTranslator.getResult());
		result.add(".mul[");
		result.addAll(rhsTranslator.getResult());
		result.add("]");
	}

	@Override
	public void visitNegationIntegerConstant(IntegerConstant exp) {
		String value = String.valueOf(exp.getValue());
		result.add(value);
	}

	@Override
	public void visitAdditionArithmetic(Addition exp) {
		Translator lhsTranslator = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTranslator);

		result.addAll(lhsTranslator.getResult());
		result.add(".add[");
		result.addAll(rhsTranslator.getResult());
		result.add("]");
	}

	@Override
	public void visitSubtractionArithmetic(Subtraction exp) {
		Translator lhsTranslator = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTranslator);

		result.addAll(lhsTranslator.getResult());
		result.add(".sub[");
		result.addAll(rhsTranslator.getResult());
		result.add("]");
	}

	@Override
	public void visitIntegerConstant(IntegerConstant exp) {
		String value = String.valueOf(exp.getValue());
		result.add(value);
	}

	@Override
	public void visitIntegerVariable(IntegerVariable exp) {
		String alloyVarName = this.originalToAlloy.get(exp.getID());
		result.add(alloyVarName);
	}

	@Override
	public void visitLessRelational(LessThan exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" < ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitLessEqualRelational(LessThanOrEqual exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" <= ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitGreaterRelational(GreaterThan exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" > ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitGreaterEqualRelational(GreaterThanOrEqual exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" >= ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitEqualityRelational(Equality exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" = ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitInequivalenceRelational(Inequality exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" != ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitDisjunctionLogical(Disjunction exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("orGate[");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(", ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add("]");
	}

	@Override
	public void visitImplicationLogical(Implication exp) { 
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(") in True)");
		this.result.add(" => ");
		this.result.add("((");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") in True))");
		this.result.add(" => True else False");
		this.result.add(")");
	}

	@Override
	public void visitVariableLogical(Instruction exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.accept(lhsTrans);
		this.result.addAll(lhsTrans.getResult());
	}

	@Override
	public void visitEquivalenceLogical(Equivalence exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" in ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitNegationLogical(Negation exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getExpression().accept(lhsTrans);
		result.add("notGate[");
		this.result.addAll(lhsTrans.getResult());
		result.add("]");
	}

	@Override
	public void visitConjunctionLogical(Conjunction exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("andGate[");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(", ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add("]");
	}

	@Override
	public void visitBooleanConstant(BooleanConstant exp) {
		boolean value = exp.getValue();
		if (value) {
//			result.add("(2.add[1] = 3)");
			result.add(this.trueInAlloy);
		} else {
			result.add(this.falseInAlloy);
//			result.add("(2 = 3)");
		}

	}

	@Override
	public void visitBooleanVariable(BooleanVariable exp) {
		String alloyVarName = this.originalToAlloy.get(exp.getID());
		result.add(alloyVarName);
//		String origName = exp.getID();
//		Translator trans = new Translator(originalToAlloy);
//		Values.getInstance().getValue(origName).getValue().accept(trans);
//		result.addAll(trans.getResult());
	}

	@Override
	public void visitPrecondStatement(PrecondStatement exp) {
		Logical precondLogical = (Logical) exp.getLogicalCondition();
		Translator tr = new Translator();
		precondLogical.accept(tr);
		result = tr.getResult();
	}

	@Override
	public void visitPostcondStatement(PostcondStatement exp) {
		Logical postcondLogical = (Logical) exp.getLogicalCondition();
		Translator tr = new Translator();
		postcondLogical.accept(tr);
		result = tr.getResult();
	}

	@Override
	public void visitVariableArithmetic(Instruction exp) {
		System.out.println("Visting visitVariableArithmetic which is not supposed to happen");
	}
	
	@Override
	public void visitRelationalOpLogical(Instruction exp) {
		System.out.println("Visting visitRelationalOpLogical which is not supposed to happen");
	}
	
	@Override
	public void visitAssignAssignment(Instruction exp) {
		System.out.println("Visting visitAssignAssignment which is not supposed to happen");
	}

	@Override
	public void visitArithmeticOperation(Instruction exp) {
		System.out.println("Visting visitArithmeticOperation which is not supposed to happen");
	}

	@Override
	public void visitRelationalOperation(Relational exp) {
		System.out.println("Visting visitRelationalOperation which is not supposed to happen");
	}

	@Override
	public void visitLogicalOpteration(Logical exp) {
		System.out.println("Visting visitLogicalOpteration which is not supposed to happen");
	}

	@Override
	public void visitForAllLambda(ForAll exp) {
		//TODO
	}
}
