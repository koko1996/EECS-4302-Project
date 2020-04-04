package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import model.declaration.VariableInitialization;
import model.statement.MultiAssignment;
import model.statement.assignment.Expression;
import model.statement.assignment.ExpressionAssignment;
import model.statement.assignment.expression.FunctionCall;
import model.statement.assignment.expression.FunctionConditional;
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
import model.values.Value;
import model.values.Values;
import model.values.ValuesGlobal;
import utils.Pair;

/*
 * Translator visitor calls to translate from input language to Alloy
 * Some functions are protected for TranslatorTest to be able to unit test them
 */
public class Translator implements Visitor {

	private int functionsTranslated;				// current number of functions translated
	
	private int ifStatementsTranslated;				// current number of if statements translated
 
	protected Map<String,String> functionsDefined;	// Mapping from original function names to their  
													// Alloy counterpart
	private Map<String, String> originalToAlloy;	// container to hold the variable name mapping 
													// from  original name to alloy name
	private Map<String,String> lhsOfUpdates ;		// container to hold the variable name mapping from 
													// original alloy name to next available alloy name 
	private Map<String,String> rhsOfUpdates ;		// container to hold the variable name mapping from 
	 												// original alloy name to last used alloy name that
													// appeared on the lhs of an assignment
	private Values values;
	
	final private String trueInAlloy;						

	final private String falseInAlloy;
	
	private String finalResult;						// Contains the result of translation
	
	private List<String> result;					// Container to store the results after a visit
	
	private Map<String, String> resultMap;			// Container to store the assignments results after 
													// a visit
	
	private Map<String, String> resultMaxUsed;		// Container to store the ampping after a visit from
													// original alloy name to last used alloy name

	public Translator() {
		finalResult = "";
		falseInAlloy = "False";
		trueInAlloy = "True";
		ifStatementsTranslated = 0;
		functionsTranslated = 0;
		values = ValuesGlobal.getInstance();
		result = new ArrayList<>();
		resultMap = new HashMap<>();
		resultMaxUsed= new HashMap<>();
		functionsDefined = new HashMap<>();
		originalToAlloy = new HashMap<>();
		lhsOfUpdates = new HashMap<>();
		rhsOfUpdates = new HashMap<>();
	}

	public Translator(Map<String, String> originalToAlloy,Map<String, String>  functionsDefined, Map<String,String> lhsOfUpdates, Map<String,String> rhsOfUpdates) {
		finalResult = "";
		falseInAlloy = "False";
		trueInAlloy = "True";
		ifStatementsTranslated = 0;
		functionsTranslated = 0;
		values = ValuesGlobal.getInstance();
		result = new ArrayList<>();
		resultMap = new HashMap<>();
		resultMaxUsed= new HashMap<>();
		this.functionsDefined = functionsDefined;
		this.originalToAlloy = originalToAlloy;
		this.lhsOfUpdates = lhsOfUpdates;
		this.rhsOfUpdates = rhsOfUpdates;
	}

	/**
	 * @return the statementsTranslated
	 */
	private void incrementFunctionsTranslated() {
		functionsTranslated++;
	}

	/**
	 * @return the statementsTranslated
	 */
	private int getFunctionsTranslated() {
		return functionsTranslated;
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
	 * @return the finalResult
	 */
	public String getFinalResult() {
		return finalResult;
	}
		
	public Map<String, String> getResultMaxUsed() {
		return resultMaxUsed;
	}

	
	/**
	 * Helper function to map the given names of variables to their alloy names
	 * It skips the variables that contain "_old" in their original names 
	 * @param vars Set of variable names (original names)
	 * @return Map that maps original name to alloy name
	 * 
	 * For Example: vars={"x","x_old","y"}, return={"x":"arg1","y":"arg2"} 
	**/
	private Map<String, String> originalToAlloyCalculator(Set<String> vars) {
		Map<String, String> result= new HashMap<>(); 
		int counter = 1;
		for (String each : vars) {
			if(!each.contains("_old")){
				String alloyVar = "arg" + (counter);
				String originalVar = each;						
				result.put(originalVar, alloyVar);
				counter++;				
			}
		}
		return result;
	}
	
	/**
	 * Helper function that removes the last appearance of symbol in sb if there is any 
	 * 
	 * @param sb StringBuilder to remove from the symbol
	 * @param symbol String representing the symbol to remove   
	 * 
	**/
	private void removeLastAppearanceOfSymbol(StringBuilder sb, String symbol){
		if(sb.lastIndexOf(symbol)!=-1){
			sb.deleteCharAt(sb.lastIndexOf(symbol));
		}
	}
	
	/**
	 * Helper function to update the value of the keys in the givenMapping map based
	 * on their largest updated values in the newMapping map  
	 * @param resultMaxUsed Map<String,String> the map to be updates   
	 * @param key the key for which the value will be updated
	 * @param newValue the newValue 
	 * 
	 * For Example: resultMaxUsed={"x":"arg1","y":"arg2"}, key="x", newValue="arg1'''" 
	 * => (After updateMaxUsed is done) resultMaxUsed={"x":"arg1'''","y":"arg2"}
	**/
	private void updateMaxUsed(Map<String,String> resultMaxUsed, String key, String newValue){
		if(resultMaxUsed.containsKey(key)){
			if(newValue.startsWith(resultMaxUsed.get(key)) && resultMaxUsed.get(key).length()<newValue.length()){
				resultMaxUsed.put(key, newValue);
			}
		}
	}
	
	/**
	 * Helper function to create a string builder object consisting of the 
	 * assignments in the given assignments Map 
	 * @param assignment Map that indicates assignments (i.e. key=value) 
	 * @return StringBuilder which represents parsing of this assignments
	 * 
	 * For Example: assignments{"arg1'":"arg2.add[2]","arg2'":"1"}
	 * return= "arg1'=arg2.add[2] and arg2'=1" 
	**/
	private StringBuilder assignmentsToString(Map<String,String> assignments){
		StringBuilder result = new StringBuilder();		
		result.append("(("+ trueInAlloy +") in True)");
		for(String key : assignments.keySet()){
			result.append(" and ");
			result.append(key);
			if (assignments.get(key) != null ){
				result.append("=");
				result.append(assignments.get(key));
			}
		}
		return result;
	}
	
	/**
	 * Helper function to create a add the assignments in the given assignments
	 * Map into the result array passed as an argument  
	 * @param assignment Map that indicates assignments (i.e. key=value) 
	 * 
	 * For Example: assignments{"arg1'":"arg2.add[2]","arg2'":"1"}
	 * result=result + ["arg1'", "=", "arg2.add[2]", " and ", "arg2'", "=", "1"] 
	**/
	private void assignmentsToString(List<String> result,Map<String,String> assignments){ 
		for (String key : assignments.keySet()) {
			this.result.add(" and ");
			this.result.add(key);
			if (assignments.get(key) != null ){
				this.result.add("=");
				this.result.add(assignments.get(key));				
			}
		}
	}
	
	/**
	 * Helper function that updates the passed StringBuilders to contait parameters
	 *  
	 * @param preOriginalToAlloy Map<String,String> maps the original names to their alloy counterparts
	 * before assignments
	 * @param postOriginalToAlloy Map<String,String> maps the original names to their alloy counterparts
	 * after the assignments
	 * @param vars Map<String,Value> list variables to use
	 * @param predParamSB StringBuilder that will contain the parameters for alloy predicate
	 * @param forAllParamSB StringBuilder that will contain the parameters for alloy for all statement
	 * @param forSomeParamSB StringBuilder that will contain the parameters for alloy for some statement
	 * @param predInputParamSB StringBuilder that will contain the parameters for alloy predicate call (i.e. predParamSB)
	**/
	private void alloyParametersCalculator(Map<String,String> preOriginalToAlloy, Map<String,String> postOriginalToAlloy, Map<String,Value> vars, StringBuilder predParamSB,
			StringBuilder forAllParamSB, StringBuilder forSomeParamSB, StringBuilder predInputParamSB){
		for (String key : preOriginalToAlloy.keySet()) {
			String originalVar = key;
			String alloyVar = preOriginalToAlloy.get(key);
			String varType = vars.get(originalVar).getType();
			List<String> remainingVars = listOfVariablesUsed(alloyVar,postOriginalToAlloy.get(key));
			
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
		removeLastAppearanceOfSymbol(predParamSB,",");
		removeLastAppearanceOfSymbol(forAllParamSB,",");
		removeLastAppearanceOfSymbol(forSomeParamSB,",");
		removeLastAppearanceOfSymbol(predInputParamSB,",");
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
	protected List<String> listOfVariablesUsed(String val, String largestVal){
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

	/**
	 * formerly named updateMaxUsed
	 * Helper function to update the values in the lhsResultMaxUsed
	 * with values in rhsResultMaxUsed (if rhsResultMaxUsed has higher values)
	 * @param lhsResultMaxUsed Map<String,String> to be updated   
	 * @param rhsResultMaxUsed Map<String,String> to use the values for the update   
	 * 
	 * For Example: lhsResultMaxUsed={"x":"arg1","y":"arg2'"}, rhsResultMaxUsed={"x":"arg1''","y":"arg2"} 
	 * => (After updateMaxUsed is done) lhsResultMaxUsed={"x":"arg1''","y":"arg2'"}
	**/
	
	protected void updateToLargestMapping(Map<String,String> lhsResultMaxUsed, Map<String,String> rhsResultMaxUsed){
		for(String key: lhsResultMaxUsed.keySet()){
			if(rhsResultMaxUsed.containsKey(key)){
				if(rhsResultMaxUsed.get(key).startsWith(lhsResultMaxUsed.get(key)) && lhsResultMaxUsed.get(key).length()<rhsResultMaxUsed.get(key).length()){
					lhsResultMaxUsed.put(key, rhsResultMaxUsed.get(key));
				}
			}
		}
	}	
	
	/**
	 * Helper function that returns a map containing the missing assignments for variables
	 * used in the postcondition statement  
	 * @param alloyAssignments Map<String,String> maps the original names to their alloy counterparts
	 * used in a specific multiassignment body
	 * @param originalToLargestAlloy Map<String,String> maps the original names to their largest alloy counterparts   
	 * 
	 * For Example: originalToAlloy={"x":"arg1","y":"arg2"}, alloyAssignments={"x":"arg1","y":"arg2'"}
	 * and originalToLargestAlloy = {"x":"arg1","y":"arg2''"}
	 * => result = {"arg2''","arg2'"}
	**/
	protected Map<String, String> largestValueMap(Map<String,String> lhsResultMaxUsed, Map<String,String> rhsResultMaxUsed){
		Map<String, String> result = new HashMap<>();
		for(String key: lhsResultMaxUsed.keySet()){
			if(rhsResultMaxUsed.containsKey(key)){
				if(rhsResultMaxUsed.get(key).startsWith(lhsResultMaxUsed.get(key)) && lhsResultMaxUsed.get(key).length()<rhsResultMaxUsed.get(key).length()){
					result.put(rhsResultMaxUsed.get(key),lhsResultMaxUsed.get(key));
				}
			}
		}	
		return result;
	}
	
	/**
	 * Helper function to update the values in the given list origOutput with their 
	 * corresponding keys (which represent their updated values) in the given map 
	 * and converts it to string
	 * @param origOutput list of strings to be updated
	 * @param updates Map<String,String> that maps keys to their corresponding new values
	 * @param otherUpdates Map<String,String> that maps keys to their corresponding new values
	 * otherUpdates is only used as an argument to updateFunctionParameters
	 * @param maxUsed Map<String,String> that maps keys to their corresponding maximum new values
	 * resultMaxUsed is only used as an argument to updateFunctionParameters
	 * 
	 * For Example: origOutput=["x","+","y","-","5"]   updates={"x":"arg1'",y="arg2''"}
	 * result = "arg1'+arg2''-5"
	 *
	 * Note: If origOutput contains a function call we handle it differently than regular
	 * variables 
	**/
	protected String updateToString(List<String> origOutput, Map<String,String> updates, Map<String,String> otherUpdates, Map<String,String> resultMaxUsed){
		StringBuilder result = new StringBuilder();
		for(int i=0; i<origOutput.size();i++){
			String str = origOutput.get(i);
			// Special case if the str is a function name (i.e it is a function call)
			if (this.functionsDefined.containsKey(str)){
				result.append(this.functionsDefined.get(str));
				i++;
				// Get the parameters of this function call
				// And update the values of this parameters
				// using updateFunctionParameters helper function
				List<String> parameters = new ArrayList<>();
				// since we know that we are parsing a function call
				// the parameters are everythin until we hit the first "]"
				// example of a function call in originalOutput 
				// is [ "test", "[", "x", "y", "z", "]" ]
				while((i+1)<origOutput.size() && !origOutput.get(i).equals("]")){
					parameters.add(origOutput.get(i));
					i++;
				}
				parameters.add(origOutput.get(i)); // add the closing bracket "]"
				result.append(updateFunctionParameters(str,parameters,updates, otherUpdates,resultMaxUsed));
			}else if(updates.containsKey(str)){
				result.append(updates.get(str));	
			} else {
				result.append(str);
			}
		}
		return result.toString();
	}
	
	
	/**
	 * Helper function to map the parameter names to the number of times they get
	 * reassigned in the actualFunction body (i.e. sequential composition) 
	 * @param actualFunction FunctionConditional object to count the parameters 
	 * @return Map that maps the variable names to their counts
	 * 
	 * For Example: acutalFunction["x","x","y"], return={"x":2,"y":1} 
	**/
	protected Map<String, Integer> functionParamCount(FunctionConditional actualFunction){
		Map<String, Value> vars = actualFunction.getVariables();
		Map<String, String> preOriginalToAlloy = originalToAlloyCalculator(vars.keySet());
		Map<String, String> postOriginalToAlloy = new HashMap<>();	// will hold the mapping after assignments
		Map<String, Integer> originalParamCount = new HashMap<>();	// will hold the function parameter counts
		
		for(String each:preOriginalToAlloy.keySet() ){
			originalParamCount.put(preOriginalToAlloy.get(each), 1);					
		}
		
		Map<String,String> tmpLhsOfUpdates = new HashMap<>();
		Map<String,String> tmpRhsOfUpdates = new HashMap<>();

		for(String key:preOriginalToAlloy.keySet()){
			tmpLhsOfUpdates.put(key,preOriginalToAlloy.get(key)+"'");
		}
		for(String key:preOriginalToAlloy.keySet()){
			tmpRhsOfUpdates.put(key,preOriginalToAlloy.get(key));
		}
		// Visit the assignments of the actual function
		Translator assignmentsTranslator = new Translator(preOriginalToAlloy, functionsDefined,tmpLhsOfUpdates,tmpRhsOfUpdates);
		actualFunction.getAssignments().accept(assignmentsTranslator);
		
		// update the postOriginalToAlloy mapping
		postOriginalToAlloy.putAll(preOriginalToAlloy);
		updateToLargestMapping(postOriginalToAlloy,assignmentsTranslator.getResultMaxUsed());
		
		// calculate the number of times each parameter has been reassigned (i.e used) in the 
		// body of the actual function
		for (String key : preOriginalToAlloy.keySet()) {
			String alloyVar = preOriginalToAlloy.get(key);
			List<String> remainingVars = listOfVariablesUsed(alloyVar,postOriginalToAlloy.get(key));	
			for(String each : remainingVars){
				originalParamCount.put(alloyVar, originalParamCount.get(alloyVar)+1);
			}
		}
		return originalParamCount;
	}

	
	/**
	 * Helper function to update the special case of mapping. Which is mapping  
	 * a function call expression 
	 * 
	 * @param functionName represents the name of the function that is being called
	 * @param origOutput list of strings to be updated (represents the paramters in a
	 * function call)
	 * @param rhsOfUpdates Map<String,String> that maps keys to their last used alloy name that
	 * appeared on the lhs of an assignment
	 * @param lhsOfUpdates Map<String,String> that maps keys to their next available alloy name
	 * @param maxUsed Map<String,String> that maps keys to their maximum used alloy name 
	 * 
	 * 
	 *
	**/
	protected String updateFunctionParameters(String functionName, List<String> origOutput, Map<String,String> rhsOfUpdates, Map<String,String> lhsOfUpdates, Map<String,String> resultMaxUsed){				;
		
		List<Integer> functionParamCounter = new ArrayList<>();  // Helper counter to know which parameter to update next
		String last ="?";
		int lastIndex = -1;
		for (int i=0;i< origOutput.size();i++){
			if(rhsOfUpdates.containsKey(origOutput.get(i))){ // make sure it is not garbage (for example "," )
				if (origOutput.get(i).equals(last)){
					functionParamCounter.set(lastIndex,functionParamCounter.get(lastIndex)+1);
					
				} else {
					functionParamCounter.add(1);
					last = origOutput.get(i);
					lastIndex++;
				}
			}
		}
		
		Pair<Integer,Integer> currIndex = new Pair<>(0,0); // Pair left represent the current Variable ->
														   // Pair right represents the curIndex in that variable
		StringBuilder result = new StringBuilder();
		
		for(String str:origOutput){
			if(rhsOfUpdates.containsKey(str)){
				if (currIndex.getR()==0){		
					// this is the first appearance of str variable
					// therefore use the mapping in the rhsOfUpdates
					// because this mapping will contain the alloy variable
					// that will have a value assigned to it in alloy
					result.append(rhsOfUpdates.get(str));
					updateMaxUsed(resultMaxUsed, str, rhsOfUpdates.get(str));
				} else {
					// this is the not first appearance of str variable
					// therefore use the mapping in the lhsOfUpdates
					// because this mapping will contain the alloy variable
					// that is available to use and no value is assigned to 
					// it in alloy
					result.append(lhsOfUpdates.get(str));
					updateMaxUsed(resultMaxUsed, str, lhsOfUpdates.get(str));
					// update the lhsOfUpdates to move on to the next available
					// alloy variable name
					lhsOfUpdates.put(str,lhsOfUpdates.get(str)+"'");
				}
				// update the index so that we know what we parsed so far
				// and how to parse the next str in the origOutput
				currIndex.setR(currIndex.getR()+1);
				if (currIndex.getR() == functionParamCounter.get(currIndex.getL())){
					currIndex.setL(currIndex.getL()+1);
					currIndex.setR(0);	
				}
			} else {
				result.append(str);
			}
		}
		return result.toString();
	}
	
	
	@Override
	public void visitFunctionCall(FunctionCall exp) {
		FunctionConditional actualFunction = (FunctionConditional) values.getValue(exp.getId()).getValue();
		List<Instruction> expectedParameters = actualFunction.getParameters();
		List<Instruction> passedParameters = exp.getParameters();
		Map<String, Instruction> actualFunctionTofunctionCall= new HashMap<>();
		
		for(int i=0;i<expectedParameters.size();i++){
			actualFunctionTofunctionCall.put(((VariableInitialization) expectedParameters.get(i)).getID(),passedParameters.get(i));
		}
		
		Map<String, String> preOriginalToAlloy = originalToAlloyCalculator(actualFunction.getVariables().keySet());
		
		Map<String, Integer> originalParamCount = functionParamCount(actualFunction);
				
		
		this.result.add(exp.getId());
		this.result.add("[");
		
		for (String key : preOriginalToAlloy.keySet()) {
			String alloyVar = preOriginalToAlloy.get(key);			
			Instruction res = actualFunctionTofunctionCall.get(key);
			Translator tr = new Translator(originalToAlloy, functionsDefined,lhsOfUpdates,rhsOfUpdates);
			res.accept(tr);
			for ( int i=0;i<originalParamCount.get(alloyVar);i++){
				this.result.addAll(tr.getResult());
				this.result.add(",");
			}
		}
		if (this.result.lastIndexOf(",") != -1){
			this.result.remove(this.result.lastIndexOf(","));	
		}

		this.result.add("] ");
				
	}
	
	@Override
	public void visitFucntionConditional(FunctionConditional exp){
		String functionName = "funFunction"+functionsTranslated;
		String predName = "predFunction"+functionsTranslated;
		String assertName = "assertFunction"+functionsTranslated;
		Map<String, Value> vars = exp.getVariables();
		String returnType = exp.getReturnType();
		String returnVariableName = exp.getReturnVariable();
		String returnVariableNameInAlloy = "return";

		
		Map<String, String> preOriginalToAlloy = originalToAlloyCalculator(vars.keySet());
		Map<String, String> postOriginalToAlloy = new HashMap<>();
		
		// Clean up the lhs and rhs updates because this must be the highest level of visit calls
		lhsOfUpdates = new HashMap<>();
		rhsOfUpdates = new HashMap<>();
		// prepare the lhs and rhs updates for visitin multiassignment
		for(String key:preOriginalToAlloy.keySet()){
			lhsOfUpdates.put(key,preOriginalToAlloy.get(key)+"'");
		}
		for(String key:preOriginalToAlloy.keySet()){
			rhsOfUpdates.put(key,preOriginalToAlloy.get(key));
		}
		
		// Visiting the precondition statement
		// Which must be a logical expression
		// lhsUpdates and rhsUpdates will not be used in this section
		Translator precondTranslator = new Translator(preOriginalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getPreCond().accept(precondTranslator);
		List<String> precondTranslated = precondTranslator.getResult();
		StringBuilder precondSB = new StringBuilder();
		precondSB.append("((");
		precondTranslated.forEach(precondSB::append);
		precondSB.append(")");
		precondSB.append(" in True");
		precondSB.append(") ");
		String precondTranslatedString = precondSB.toString();


		
		Map<String,String> tmppreOriginalToAlloy=preOriginalToAlloy;
		Translator assignmentsTranslator = new Translator(preOriginalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getAssignments().accept(assignmentsTranslator);
		this.resultMaxUsed.putAll(assignmentsTranslator.getResultMaxUsed());
		assert(tmppreOriginalToAlloy.equals(preOriginalToAlloy));	
		
		// update the post OriginalToAlloy map so that we use the latest
		// version of a variable in Alloy (i.e. use arg1' instead of arg1)
		// if there has been an assignment to arg1 in the multiassignment body
		
		for(String key: preOriginalToAlloy.keySet() ){
			postOriginalToAlloy.put(key + "_old", preOriginalToAlloy.get(key));
			postOriginalToAlloy.put(key , rhsOfUpdates.get(key));
		}
		
		
		StringBuilder assignmentsSB = assignmentsToString(assignmentsTranslator.getResultMap());		
		String assignmentsTranslatedString = assignmentsSB.toString();
	
		StringBuilder assignmentsOfFunctionInAlloySB = new StringBuilder();
		assignmentsOfFunctionInAlloySB.append("\t{ ").append(returnVariableNameInAlloy).append(" : ").append(returnType);
		assignmentsOfFunctionInAlloySB.append(" | ").append(assignmentsTranslatedString).append(" and ");
		assignmentsOfFunctionInAlloySB.append(returnVariableNameInAlloy).append(" = ").append(postOriginalToAlloy.get(returnVariableName));
		assignmentsOfFunctionInAlloySB.append("}\n");
		String assignmentsOfFunctionInAlloyString = assignmentsOfFunctionInAlloySB.toString();
		
		
//		System.out.println("assignments: " + assignmentsTranslator.getResultMap().toString());
//		System.out.println("preOriginalToAlloy: " + preOriginalToAlloy.toString());
//		System.out.println("postOriginalToAlloy: " + postOriginalToAlloy.toString());
		
		Translator postcondTranslator = new Translator(postOriginalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getPostCond().accept(postcondTranslator);
		List<String> postcondTranslated = postcondTranslator.getResult();
		StringBuilder postcondSB = new StringBuilder();
		postcondSB.append("((");
		postcondTranslated.forEach(postcondSB::append);
		postcondSB.append(") in True)");
		String postcondTranslatedString = postcondSB.toString();

		
		StringBuilder predParamSB = new StringBuilder();
		StringBuilder forAllParamSB = new StringBuilder();
		StringBuilder forSomeParamSB = new StringBuilder();
		StringBuilder predInputParamSB = new StringBuilder();
		alloyParametersCalculator(preOriginalToAlloy, this.resultMaxUsed, vars, predParamSB, forAllParamSB, forSomeParamSB, predInputParamSB);
		
		StringBuilder predSignitureSB = new StringBuilder();
		predSignitureSB.append("pred ").append(predName);
		predSignitureSB.append(" [").append(predParamSB).append("] {\n");
		predSignitureSB.append("\t").append(assignmentsTranslatedString).append("\n\t");
		predSignitureSB.append(postcondTranslatedString).append("\t\t\t // post condition\n}\n\n");
				
		
		StringBuilder funSignitureSB = new StringBuilder();
		funSignitureSB.append("fun ").append(functionName);
		funSignitureSB.append(" [").append(predParamSB).append("] : ");
		funSignitureSB.append(returnType).append(" {\n");
		funSignitureSB.append(assignmentsOfFunctionInAlloyString);
		funSignitureSB.append("}\n\n");
	
		
		StringBuilder assertSB = new StringBuilder();
		assertSB.append("check ").append(assertName).append(" {\n");
		assertSB.append("\t { all ").append(forAllParamSB).append(" | ");
		if (forSomeParamSB.length()>0){
			assertSB.append("some ").append(forSomeParamSB).append(" | ");	
		}
		assertSB.append(precondTranslatedString).append(" => ").append(predName).append("[");
		assertSB.append(predInputParamSB).append("] }").append("\n}\n");

		this.finalResult = predSignitureSB.append(funSignitureSB).append(assertSB).toString();
		
		functionsDefined.put(exp.getName(), functionName);
		this.incrementFunctionsTranslated();	
	}


	@Override
	public void visitConditionalAssertionStatement(AssertedConditional exp) {
		String predName = "predIfStatement";
		String assertName = "assertIfStatement";
		Map<String, Value> vars = exp.getVariables();
		
		Map<String, String> preOriginalToAlloy = originalToAlloyCalculator(vars.keySet());
		Map<String, String> postOriginalToAlloy = new HashMap<>();
		
		lhsOfUpdates = new HashMap<>();
		rhsOfUpdates = new HashMap<>();
		for(String key:preOriginalToAlloy.keySet()){
			lhsOfUpdates.put(key,preOriginalToAlloy.get(key)+"'");
		}
		for(String key:preOriginalToAlloy.keySet()){
			rhsOfUpdates.put(key,preOriginalToAlloy.get(key));
		}
		
		Translator precondTranslator = new Translator(preOriginalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getPreCond().accept(precondTranslator);
		List<String> precondTranslated = precondTranslator.getResult();
		StringBuilder precondSB = new StringBuilder();
		precondSB.append("((");
		precondTranslated.forEach(precondSB::append);
		precondSB.append(") in True) ");
		String precondTranslatedString = precondSB.toString();

		Map<String,String> tmppreOriginalToAlloy=preOriginalToAlloy;
		Translator ifStatementTranslator = new Translator(preOriginalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates); // might change map values
		exp.getIfStatment().accept(ifStatementTranslator);
		assert(tmppreOriginalToAlloy.equals(preOriginalToAlloy));
		
		this.resultMaxUsed.putAll(ifStatementTranslator.getResultMaxUsed());
		for(String key: preOriginalToAlloy.keySet() ){
			postOriginalToAlloy.put(key + "_old", preOriginalToAlloy.get(key));
			postOriginalToAlloy.put(key , rhsOfUpdates.get(key));
		}
		
		List<String> ifStatementTranslated = ifStatementTranslator.getResult();
		StringBuilder ifStatementSB = new StringBuilder();
		ifStatementTranslated.forEach(ifStatementSB::append);
		String ifStatementTranslatedString = ifStatementSB.toString();

	
//		System.out.println("assignments: " + ifStatementTranslator.getResultMap().toString());
//		System.out.println("preOriginalToAlloy: " + preOriginalToAlloy.toString());
//		System.out.println("postOriginalToAlloy: " + postOriginalToAlloy.toString());
		
		Translator postcondTranslator = new Translator(postOriginalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getPostCond().accept(postcondTranslator);
		List<String> postcondTranslated = postcondTranslator.getResult();
		StringBuilder postcondSB = new StringBuilder();
		postcondSB.append("((");
		postcondTranslated.forEach(postcondSB::append);
		postcondSB.append(") in True) ");
		String postcondTranslatedString = postcondSB.toString();

		StringBuilder predParamSB = new StringBuilder();
		StringBuilder forAllParamSB = new StringBuilder();
		StringBuilder forSomeParamSB = new StringBuilder();
		StringBuilder predInputParamSB = new StringBuilder();
		alloyParametersCalculator(preOriginalToAlloy, this.resultMaxUsed, vars, predParamSB, forAllParamSB, forSomeParamSB, predInputParamSB);
		
		StringBuilder predSignitureSB = new StringBuilder();
		predSignitureSB.append("pred ").append(predName).append(ifStatementsTranslated);
		predSignitureSB.append(" [").append(predParamSB).append("] {\n");
		predSignitureSB.append("\t").append(ifStatementTranslatedString).append(" \n\t");
		predSignitureSB.append(postcondTranslatedString).append("\t\t\t // post condition\n}\n\n");
		
		StringBuilder assertSB = new StringBuilder();
		assertSB.append("check ").append(assertName).append(ifStatementsTranslated).append(" {\n");
		assertSB.append("\t { all ").append(forAllParamSB).append(" |  ");
		if (forSomeParamSB.length()>0){
			assertSB.append("some ").append(forSomeParamSB).append(" | ");	
		}
		assertSB.append(precondTranslatedString).append(" => ").append(predName).append(ifStatementsTranslated).append("[");
		assertSB.append(predInputParamSB).append("] }").append("\n}\n");

		this.finalResult = predSignitureSB.append(assertSB).toString();
		
		this.incrementStatementsTranslated();
	}
	

	@Override
	public void visitIfConditional(IfElseIfStatement exp) {
		Translator conditionTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getCondition().accept(conditionTranslator);
		
		Map<String,String> origRhsOfUpdates = new HashMap<>(rhsOfUpdates);
		Map<String,String> ifRhsOfUpdates = new HashMap<>(origRhsOfUpdates);
		Translator ifTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,ifRhsOfUpdates);
		exp.getAssignments().accept(ifTranslator);
		this.resultMaxUsed.putAll(ifTranslator.getResultMaxUsed());
		updateToLargestMapping(rhsOfUpdates, ifRhsOfUpdates);
		
		
		// Parse ElseIf if there is any 	
		List<List<String>> elseIfConditions = new ArrayList<>();
		List<Map<String,String>> elseIfAssignments = new ArrayList<>();
		List<Map<String,String>> elsIfRhsOfUpdatesList = new ArrayList<>();
		for ( ElseIfStatement stmt : exp.getElseIfStatments()){
			Map<String,String> elsIfRhsOfUpdates = new HashMap<>(origRhsOfUpdates);
			Translator elseIfTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,elsIfRhsOfUpdates);
			stmt.accept(elseIfTranslator);
			elseIfConditions.add(elseIfTranslator.getResult());
			elseIfAssignments.add(elseIfTranslator.getResultMap());
			elsIfRhsOfUpdatesList.add(elsIfRhsOfUpdates);
			updateToLargestMapping(this.resultMaxUsed,elseIfTranslator.getResultMaxUsed());
			updateToLargestMapping(rhsOfUpdates, elsIfRhsOfUpdates);
		}
		assert(elseIfAssignments.size()==elseIfConditions.size());
		
		Map<String,String> elseRhsOfUpdates = new HashMap<>(origRhsOfUpdates);
		Translator elseTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,elseRhsOfUpdates);		
		if (exp.getElseStatment() != null) {
			exp.getElseStatment().getAssignments().accept(elseTranslator);
			updateToLargestMapping(this.resultMaxUsed,elseTranslator.getResultMaxUsed());
			updateToLargestMapping(rhsOfUpdates, elseRhsOfUpdates);
		}

		
//		System.out.println("getOriginalToAlloy: " + this.getOriginalToAlloy().toString());
//		System.out.println("If Updates: " + ifTranslator.resultMap.toString());
//		System.out.println("ElseIf conditions: " + elseIfConditions.toString());
//		System.out.println("ElseIf  Updates: " + elseIfAssignments.toString());
//		System.out.println("Else Updates: " + elseTranslator.resultMap.toString());

		this.result.add("((");
		this.result.addAll(conditionTranslator.getResult());
		this.result.add(") in True) => \n\t\t");
		this.result.add(" (("+ trueInAlloy +") in True)");
		assignmentsToString(this.result,ifTranslator.getResultMap());
		Map<String,String> missingAssignments = largestValueMap(ifRhsOfUpdates,rhsOfUpdates);
//		System.out.println("If missingAssignments: " + missingAssignments.toString());
		assignmentsToString(this.result,missingAssignments);
		
		for(int i=0;i<elseIfConditions.size();i++){
			this.result.add("\n\telse (( ");
			this.result.addAll(elseIfConditions.get(i));
			this.result.add(" ) in True) => \n\t\t");
			this.result.add(" (("+ trueInAlloy +") in True)");
			assignmentsToString(this.result,elseIfAssignments.get(i));
			missingAssignments = largestValueMap(elsIfRhsOfUpdatesList.get(i),rhsOfUpdates);
//			System.out.println("else If missingAssignments: " + missingAssignments.toString());
			assignmentsToString(this.result,missingAssignments);
		}		
		
		if(exp.getElseStatment() != null){
			this.result.add("\n\telse \n\t\t");
			this.result.add(" (("+ trueInAlloy +") in True)");
			assignmentsToString(this.result,elseTranslator.getResultMap());
			
			missingAssignments = largestValueMap(elseRhsOfUpdates,rhsOfUpdates);
//			System.out.println("else missingAssignments: " + missingAssignments.toString());
			assignmentsToString(this.result,missingAssignments);
		}
	}

	@Override
	public void visitElseIfConditional(ElseIfStatement exp) {
		Translator conditionTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getCondition().accept(conditionTranslator);		
		this.result.addAll(conditionTranslator.getResult());
		
		Translator assignmentTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getAssignments().accept(assignmentTranslator );
		this.resultMap.putAll(assignmentTranslator.getResultMap());
		this.resultMaxUsed.putAll(assignmentTranslator.getResultMaxUsed());
	}
	
	
	@Override
	public void visitMultipleAssignments(MultiAssignment exp) {
		// Must be in the body of if/else statement
		// originalToOriginal is needed so that the visitors that get
		// called in this method don't do any mapping to Alloy
		// because for assignments and if statements the mapping is 
		// done in this method

		Map<String,String> originalToOriginal = new HashMap<>();
		for(String key:originalToAlloy.keySet()){
			originalToOriginal.put(key,key);
		}
		// fill in with original mapping
		this.resultMaxUsed.putAll(rhsOfUpdates);
		for (Instruction inst : exp.getAssignments()) {
			if (inst instanceof Expression){
				// Skip non assignments as they don't mean anything in Alloy
				// if not skipped then this translation will be converted to 
				// be a fact in Alloy due to "and"ing
				continue;
			}
			
			Translator instTranslator = null;
			if (inst instanceof IfElseIfStatement){
				// 
//				System.out.println("IfElseIfStatement");
				Map<String,String> newOriginalToAlloy = new HashMap<>(rhsOfUpdates);
				instTranslator = new Translator(newOriginalToAlloy, functionsDefined,lhsOfUpdates,rhsOfUpdates);
				inst.accept(instTranslator);
				StringBuilder res =new StringBuilder();
				res.append(" ( ");
				for(String str: instTranslator.getResult()){
					res.append(str);	
				}
				res.append(" ) ");
				this.resultMap.put(res.toString(), null);
				updateToLargestMapping(this.resultMaxUsed,instTranslator.getResultMaxUsed());
			} else {
				instTranslator = new Translator(originalToOriginal, functionsDefined,lhsOfUpdates,rhsOfUpdates);
				inst.accept(instTranslator);
				List<String> lhsList = new ArrayList<>();
				lhsList.add(instTranslator.getResult().get(0));
				List<String> rhsList = new ArrayList<>();
				for(int i=1;i<instTranslator.getResult().size();i++){
					rhsList.add(instTranslator.getResult().get(i));	
				}
				assert(lhsList.size()==1);
//				System.out.println("lhs List: " + lhsList.toString());
//				System.out.println("lhs Updates: " + lhsOfUpdates.toString());
//				System.out.println("rhs List: " + rhsList.toString());
//				System.out.println("rhs Updates: " + rhsOfUpdates.toString());

//				System.out.println("Before lhs Updates: " + lhsOfUpdates.toString());
//				System.out.println("Before rhs Updates: " + rhsOfUpdates.toString());
				
				String lhs = updateToString(lhsList, lhsOfUpdates, rhsOfUpdates, this.resultMaxUsed);
				lhsOfUpdates.put(lhsList.get(0),lhsOfUpdates.get(lhsList.get(0))+"'");
				
				String rhs = updateToString(rhsList, rhsOfUpdates, lhsOfUpdates, this.resultMaxUsed);
				rhsOfUpdates.put(lhsList.get(0),lhs);
				
//				System.out.println("After lhs Updates: " + lhsOfUpdates.toString());
//				System.out.println("After rhs Updates: " + rhsOfUpdates.toString());
//				
//				System.out.println("Lhs String: " + lhs);
//				System.out.println("rhs String: " + rhs);
			
				updateMaxUsed(this.resultMaxUsed,lhsList.get(0),lhs);

				this.resultMap.put(lhs, rhs);	
			}
		}
		for(String key:originalToAlloy.keySet()){
			if (key.equals("True")|| key.equals("False") || key.matches("-?\\d+")){
				this.resultMap.put(originalToAlloy.get(key), key);
			}	
		}
		
//		System.out.println("Final");
//		System.out.println("Final originalToAlloy: " + originalToAlloy.toString());
	}

	public void visitAssignExpression(ExpressionAssignment exp) {
		String alloyVarName = this.originalToAlloy.get(exp.getID());
		this.result.add(alloyVarName);
		Translator rhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getExpr().accept(rhsTranslator);
		this.result.addAll(rhsTranslator.getResult());
	}

	
	@Override
	public void visitParanthesesExpression(ParanthesesExpression exp) {
		Translator innerTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getExpression().accept(innerTranslator);
		result = innerTranslator.getResult();
	}

	@Override
	public void visitDivisionArithmetic(Division exp) {
		Translator lhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTranslator);

		result.addAll(lhsTranslator.getResult());
		result.add(".div[");
		result.addAll(rhsTranslator.getResult());
		result.add("]");
	}


	@Override
	public void visitModuloArithmetic(Modulo exp) {
		Translator lhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTranslator);

		result.addAll(lhsTranslator.getResult());
		result.add(".rem[");
		result.addAll(rhsTranslator.getResult());
		result.add("]");
	}

	@Override
	public void visitMultiplicationArithmetic(Multiplication exp) {
		Translator lhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
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
		Translator lhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTranslator);

		result.addAll(lhsTranslator.getResult());
		result.add(".add[");
		result.addAll(rhsTranslator.getResult());
		result.add("]");
	}

	@Override
	public void visitSubtractionArithmetic(Subtraction exp) {
		Translator lhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
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
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" < ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitLessEqualRelational(LessThanOrEqual exp) {
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" <= ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitGreaterRelational(GreaterThan exp) {
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" > ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitGreaterEqualRelational(GreaterThanOrEqual exp) {
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" >= ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitEqualityRelational(Equality exp) {
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" = ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitInequivalenceRelational(Inequality exp) {
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" != ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitDisjunctionLogical(Disjunction exp) {
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("orGate[");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(", ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add("]");
	}

	@Override
	public void visitImplicationLogical(Implication exp) { 
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
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
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.accept(lhsTrans);
		this.result.addAll(lhsTrans.getResult());
	}

	@Override
	public void visitEquivalenceLogical(Equivalence exp) {
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getRightExpr().accept(rhsTrans);
		this.result.add("((");
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" in ");
		this.result.addAll(rhsTrans.getResult());
		this.result.add(") => True else False)");
	}

	@Override
	public void visitNegationLogical(Negation exp) {
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getExpression().accept(lhsTrans);
		result.add("notGate[");
		this.result.addAll(lhsTrans.getResult());
		result.add("]");
	}

	@Override
	public void visitConjunctionLogical(Conjunction exp) {
		Translator lhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy,functionsDefined,lhsOfUpdates,rhsOfUpdates);
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
			result.add(this.trueInAlloy);
		} else {
			result.add(this.falseInAlloy);
		}
	}

	@Override
	public void visitBooleanVariable(BooleanVariable exp) {
		String alloyVarName = this.originalToAlloy.get(exp.getID());
		result.add(alloyVarName);
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

}
