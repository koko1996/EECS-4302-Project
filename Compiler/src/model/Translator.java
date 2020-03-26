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

	private int statementsTranslated;

	private String finalResult;
	
	private List<String> result;

	private Map<String, String> resultMap;

	private Map<String, String> originalToAlloy;

	private final String fieldName = "field";

	private String trueInAlloy;

	private String falseInAlloy;

	public Translator() {
		finalResult = "";
		falseInAlloy = " (2=3)";
		trueInAlloy = "(2.add[1]=3)";
		statementsTranslated = 0;
		result = new ArrayList<>();
		resultMap = new HashMap<>();
		originalToAlloy = new HashMap<>();
	}

	public Translator(Map<String, String> originalToAlloy) {
		finalResult = "";
		falseInAlloy = " (2=3)";
		trueInAlloy = "(2.add[1]=3)";
		statementsTranslated = 0;
		result = new ArrayList<>();
		resultMap = new HashMap<>();
		this.originalToAlloy = originalToAlloy;
	}


	/**
	 * @return the statementsTranslated
	 */
	public void incrementStatementsTranslated() {
		statementsTranslated++;
	}

	/**
	 * @return the statementsTranslated
	 */
	public int getStatementsTranslated() {
		return statementsTranslated;
	}

	/**
	 * @return the result
	 */
	public List<String> getResult() {
		return result;
	}

	/**
	 * @return the resultMap
	 */
	public Map<String, String> getResultMap() {
		return resultMap;
	}

	/**
	 * @return the originalToAlloy
	 */
	public Map<String, String> getOriginalToAlloy() {
		return originalToAlloy;
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @return the finalResult
	 */
	public String getFinalResult() {
		return finalResult;
	}
	
	private List<String> listOfVariablesUsed(String val, String largestVal){
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
		String predName = "predStatement";
		String assertName = "assertStatement";
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
		precondTranslated.forEach(precondSB::append);
		String precondTranslatedString = precondSB.toString();

		
		Translator functionTranslator = new Translator(new HashMap<String, String>(preOriginalToAlloy)); // might change map values
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
		postcondTranslated.forEach(postcondSB::append);
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
		predSignitureSB.append("pred ").append(predName).append(statementsTranslated);
		predSignitureSB.append(" [").append(predParamSB).append("] {\n");
		predSignitureSB.append("\t").append(functionTranslatedString).append(" \n\t");
		predSignitureSB.append(postcondTranslatedString).append("\t\t\t // post condition\n}\n\n");
		
		this.finalResult = predSignitureSB.toString();
		
		StringBuilder assertSB = new StringBuilder();
		assertSB.append("check ").append(assertName).append(statementsTranslated).append(" {\n");
		assertSB.append("\t { all ").append(forAllParamSB).append(" |  ");
		if (forSomeParamSB.length()>0){
			assertSB.append("some ").append(forSomeParamSB).append(" | ");	
		}
		assertSB.append(precondTranslatedString).append(" => ").append(predName).append(statementsTranslated).append("[");
		assertSB.append(predInputParamSB).append("] }").append("\n}");

		this.incrementStatementsTranslated();

		this.finalResult += assertSB.toString();
	}
	
	private void originalToAlloyUpdateValues (Map<String, String> originalToAlloy, String newValue) {
		for(String key:originalToAlloy.keySet()){
			if(newValue.startsWith(originalToAlloy.get(key))){
				originalToAlloy.put(key, newValue);
				break;
			}
		}
	}

	@Override
	public void visitIfConditional(IfElseIfStatement exp) {
		Translator conditionTranslator = new Translator(originalToAlloy);
		exp.getCondition().accept(conditionTranslator);

		resultMap.putAll(originalToAlloy);
		
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

		System.out.println("getOriginalToAlloy: " + this.getOriginalToAlloy().toString());
		System.out.println("If Updates: " + ifTranslator.resultMap.toString());
		System.out.println("ElseIf conditions: " + elseIfConditions.toString());
		System.out.println("ElseIf  Updates: " + elseIfAssignments.toString());
		System.out.println("Else Updates: " + elseTranslator.resultMap.toString());


		this.result.add("(");
		this.result.addAll(conditionTranslator.getResult());
		this.result.add(")");
		this.result.add(" => ");
		this.result.add("\n\t\t");
		this.result.add(" (1.add[2]=3) ");
		for (String key : ifTranslator.getResultMap().keySet()) {
			this.result.add(" and ");
			this.result.add(key);
			this.result.add("=");
			this.result.add(ifTranslator.getResultMap().get(key));
			originalToAlloyUpdateValues(originalToAlloy, key);
		}
		
		
		for(int i=0;i<elseIfConditions.size();i++){
			this.result.add("\n\telse");
			this.result.add(" ( ");
			this.result.addAll(elseIfConditions.get(i));
			this.result.add(" ) ");
			this.result.add(" => ");
			this.result.add("\n\t\t");
			this.result.add(" (1.add[2]=3) ");
			for (String key : elseIfAssignments.get(i).keySet()) {
				this.result.add(" and ");
				this.result.add(key);
				this.result.add("=");
				this.result.add(elseIfAssignments.get(i).get(key));
				originalToAlloyUpdateValues(originalToAlloy, key);
			}
		}		
		
		if(exp.getElseStatment() != null){
			this.result.add("\n\telse \n");
			for (String key : elseTranslator.getResultMap().keySet()) {
				this.result.add("\t\t");
				this.result.add(key);
				this.result.add("=");
				this.result.add(elseTranslator.getResultMap().get(key));
				originalToAlloyUpdateValues(originalToAlloy, key);
				this.result.add(" and ");
			}
			this.result.remove(this.result.size()-1);
		}
		this.resultMap = originalToAlloy;
		System.out.println("in if ToAlloy Update Values: " + originalToAlloy.toString());
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
				// This translation will be converted to be a fact in Alloy due to "and"ing
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
	public void visitAssignAssignment(Instruction exp) {

	}

	@Override
	public void visitArithmeticOperation(Instruction exp) {

	}

	@Override
	public void visitRelationalOperation(Relational exp) {

	}

	@Override
	public void visitLogicalOpteration(Logical exp) {

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
	public void visitVariableArithmetic(Instruction exp) {

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
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" < ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitLessEqualRelational(LessThanOrEqual exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.result);
		this.result.add(" <= ");
		this.result.addAll(rhsTrans.result);
	}

	@Override
	public void visitGreaterRelational(GreaterThan exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" > ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitGreaterEqualRelational(GreaterThanOrEqual exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" >= ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitEqualityRelational(Equality exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" = ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitInequivalenceRelational(Inequality exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" != ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitDisjunctionLogical(Disjunction exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" or ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitImplicationLogical(Implication exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" => ");
		this.result.addAll(rhsTrans.getResult());
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
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" = ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitNegationLogical(Negation exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getExpression().accept(lhsTrans);
		result.add("not");
		result.add("(");
		this.result.addAll(lhsTrans.getResult());
		result.add(")");
	}

	@Override
	public void visitConjunctionLogical(Conjunction exp) {
		Translator lhsTrans = new Translator(originalToAlloy);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" and ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitBooleanConstant(BooleanConstant exp) {
		boolean value = exp.getValue();
		if (value) {
			result.add(this.trueInAlloy);
		} else {
			result.add(this.falseInAlloy);
		}

	}

	@Override
	public void visitBooleanVariable(BooleanVariable exp) {
		String origName = exp.getID();
		Translator trans = new Translator(originalToAlloy);
		Values.getInstance().getValue(origName).getValue().accept(trans);
		result.addAll(trans.getResult());
	}

	@Override
	public void visitRelationalOpLogical(Instruction exp) {

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

}
