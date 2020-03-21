package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.atn.OrderedATNConfigSet;

import model.statement.MultiAssignment;
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

	private List<String> result;

	private Map<String, String> resultMap;

	private Map<String, String> originalToAlloy;

	private final String fieldName = "field";

	private String finalResult;

	private String postOldSyntax;

	private String trueInAlloy;

	private String falseInAlloy;

	public Translator() {
		finalResult = "";
		postOldSyntax = "";
		falseInAlloy = " (2=3)";
		trueInAlloy = "(2.add[1]=3)";
		statementsTranslated = 0;
		result = new ArrayList<>();
		resultMap = new HashMap<>();
		originalToAlloy = new HashMap<>();
	}

	public Translator(Map<String, String> originalToAlloy, String postOldSyntax) {
		finalResult = "";
		falseInAlloy = " (2=3)";
		trueInAlloy = "(2.add[1]=3)";
		statementsTranslated = 0;
		result = new ArrayList<>();
		resultMap = new HashMap<>();
		this.originalToAlloy = originalToAlloy;
		this.postOldSyntax = postOldSyntax;
	}

	// no re-assignment in ensure
	// ((x>y) and (x_new == x+2+3+1 and y_new==y) and (z = z_old)) or ((x<=y)
	// and (x = x_old and y = y_old+1)))
	// (not(x==x_old) or (x == x_old+2+3+1 and y==y_old)) or ((x<=y) and (x =
	// x_old and y = y_old+1)))
	// ((n.arg1 > n.arg2 and
	// addOneConditionalEnsure[n.arg1,n.arg2,n.arg1.add[1],n.arg2]) or (n.arg1
	// <= n.arg2 and
	// addOneConditionalEnsure[n.arg1,n.arg2,n.arg1,n.arg2.add[1]]))

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

	/**
	 * @return the postOldSyntax
	 */
	public String getPostOldSyntax() {
		return postOldSyntax;
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
			String alloyVar = "arg" + (counter);
			String alloyPostVar = alloyVar+"'";
			String originalVar = each;
			String varType = vars.get(originalVar).getType();

			predParamSB.append(alloyVar).append(":").append(varType).append(",");
			predParamSB.append(alloyPostVar).append(":").append(varType).append(",");
			
			forAllParamSB.append(alloyVar).append(":").append(varType).append(",");
			forSomeParamSB.append(alloyPostVar).append(":").append(varType).append(",");
			predInputParamSB.append(alloyVar).append(",").append(alloyPostVar).append(",");
			
			preOriginalToAlloy.put(originalVar, alloyVar);
			postOriginalToAlloy.put(originalVar + "_old", alloyVar);
			postOriginalToAlloy.put(originalVar , alloyPostVar);

			counter++;
		}
		
		
		predParamSB.deleteCharAt(predParamSB.lastIndexOf(","));
		forAllParamSB.deleteCharAt(forAllParamSB.lastIndexOf(","));
		forSomeParamSB.deleteCharAt(forSomeParamSB.lastIndexOf(","));
		predInputParamSB.deleteCharAt(predInputParamSB.lastIndexOf(","));
		
		
		Translator functionTranslator = new Translator(preOriginalToAlloy, postOldSyntax);
		exp.getIfStatment().accept(functionTranslator);
		List<String> functionTranslated = functionTranslator.getResult();
		StringBuilder functionSB = new StringBuilder();
		functionTranslated.forEach(functionSB::append);
		String functionTranslatedString = functionSB.toString();
		
		Translator precondTranslator = new Translator(preOriginalToAlloy, postOldSyntax);
		exp.getPreCond().accept(precondTranslator);
		List<String> precondTranslated = precondTranslator.getResult();
		StringBuilder precondSB = new StringBuilder();
		precondTranslated.forEach(precondSB::append);
		String precondTranslatedString = precondSB.toString();

		Translator postcondTranslator = new Translator(postOriginalToAlloy, postOldSyntax);
		exp.getPostCond().accept(postcondTranslator);
		List<String> postcondTranslated = postcondTranslator.getResult();
		StringBuilder postcondSB = new StringBuilder();
		postcondTranslated.forEach(postcondSB::append);
		String postcondTranslatedString = postcondSB.toString();

		
		StringBuilder predSignitureSB = new StringBuilder();
		predSignitureSB.append("pred ").append(predName).append(statementsTranslated);
		predSignitureSB.append(" [").append(predParamSB).append("] {\n");
		predSignitureSB.append("\t").append(functionTranslatedString).append(" \n\t");
		predSignitureSB.append(postcondTranslatedString).append("\n}\n\n");
		
		this.finalResult = predSignitureSB.toString();
		
		
		StringBuilder assertSB = new StringBuilder();
		assertSB.append("check ").append(assertName).append(statementsTranslated).append(" {\n");
		assertSB.append("\t { all ").append(forAllParamSB).append(" | some ").append(forSomeParamSB);
		assertSB.append(" | ").append(precondTranslatedString).append(" => ").append(predName).append(statementsTranslated).append("[");
		assertSB.append(predInputParamSB).append("] }").append("\n}");

		this.incrementStatementsTranslated();

		this.finalResult += assertSB.toString();
	}

	@Override
	public void visitIfConditional(IfElseIfStatement exp) {
		Translator conditionTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getCondition().accept(conditionTranslator);

		Translator ifTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getAssignments().accept(ifTranslator);
		
		
		// Parse ElseIf if there is any 	
		List<List<String>> elseIfConditions = new ArrayList<>();
		List<Map<String,String>> elseIfAssignments = new ArrayList<>();
		for ( ElseIfStatement stmt : exp.getElseIfStatments()){
			Translator elseIfTranslator = new Translator(originalToAlloy, postOldSyntax);
			stmt.accept(elseIfTranslator);
			elseIfConditions.add(elseIfTranslator.getResult());
			elseIfAssignments.add(elseIfTranslator.getResultMap());
		}
		assert(elseIfAssignments.size()==elseIfConditions.size());
		
		Translator elseTranslator = new Translator(originalToAlloy, postOldSyntax);
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
		this.result.add(" (1.add[2]=3) ");
		for (String key : ifTranslator.getResultMap().keySet()) {
			this.result.add(" and ");
			this.result.add(key+"'");
			this.result.add("=");
			this.result.add(ifTranslator.getResultMap().get(key));
		}
		
		
		for(int i=0;i<elseIfConditions.size();i++){
			this.result.add(" else");
			this.result.add(" ( ");
			this.result.addAll(elseIfConditions.get(i));
			this.result.add(" ) ");
			for (String key : elseIfAssignments.get(i).keySet()) {
				this.result.add(key+"'");
				this.result.add("=");
				this.result.add(ifTranslator.getResultMap().get(key));
				this.result.add(" and ");
			}
			this.result.remove(this.result.size()-1);
		}		
		
		if(exp.getElseStatment() != null){
			this.result.add("\n else \n");
			for (String key : elseTranslator.getResultMap().keySet()) {
				this.result.add(key+"'");
				this.result.add("=");
				this.result.add(ifTranslator.getResultMap().get(key));
				this.result.add(" and ");
			}
			this.result.remove(this.result.size()-1);
		}
	}

	@Override
	public void visitElseIfConditional(ElseIfStatement exp) {
		Translator conditionTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getCondition().accept(conditionTranslator);
		this.result.addAll(conditionTranslator.getResult());
		
		Translator assignmentTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getAssignments().accept(assignmentTranslator );
		this.resultMap.putAll(assignmentTranslator.getResultMap());
		
	}
	
	@Override
	public void visitMultipleAssignments(MultiAssignment exp) {

		for (Instruction inst : exp.getAssignments()) {
			Translator instTranslator = new Translator(originalToAlloy, postOldSyntax);
			inst.accept(instTranslator);
			int size = instTranslator.getResult().size();
			System.out.println("SIZE : "+ size);
			assert (instTranslator.getResult().size() == 2);
			this.resultMap.put(instTranslator.getResult().get(0), instTranslator.getResult().get(1));

		}
	}

	public void visitAssignExpression(ExpressionAssignment exp) {
		String alloyVarName = this.originalToAlloy.get(exp.getID());
		this.result.add(alloyVarName);
		Translator rhsTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getExpr().accept(rhsTranslator);
		StringBuilder rhsResult = new StringBuilder();
		for (String str: rhsTranslator.getResult()){
			rhsResult.append(str);
		}
		
		this.result.add(rhsResult.toString());
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
		Translator innerTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getExpression().accept(innerTranslator);
		result = innerTranslator.getResult();
	}

	@Override
	public void visitDivisionArithmetic(Division exp) {
		Translator lhsTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy, postOldSyntax);
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
		Translator lhsTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTranslator);

		result.addAll(lhsTranslator.getResult());
		result.add(".rem[");
		result.addAll(rhsTranslator.getResult());
		result.add("]");
	}

	@Override
	public void visitMultiplicationArithmetic(Multiplication exp) {
		Translator lhsTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy, postOldSyntax);
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
		Translator lhsTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTranslator);

		result.addAll(lhsTranslator.getResult());
		result.add(".add[");
		result.addAll(rhsTranslator.getResult());
		result.add("]");
	}

	@Override
	public void visitSubtractionArithmetic(Subtraction exp) {
		Translator lhsTranslator = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTranslator);

		Translator rhsTranslator = new Translator(originalToAlloy, postOldSyntax);
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
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" < ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitLessEqualRelational(LessThanOrEqual exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTrans);
		boolean refersToOLD = false;
		for (String res : lhsTrans.result) {
			if (res.contains(this.fieldName)) {
				refersToOLD = true;
			}
		}
		for (String res : rhsTrans.result) {
			if (res.contains(this.fieldName)) {
				refersToOLD = true;
			}
		}
		if (refersToOLD) {
			this.result.add(this.postOldSyntax);
		}
		this.result.addAll(lhsTrans.result);
		this.result.add(" <= ");
		this.result.addAll(rhsTrans.result);
		if (refersToOLD) {
			this.result.add("} ");
		}
	}

	@Override
	public void visitGreaterRelational(GreaterThan exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTrans);
		boolean refersToOLD = false;
		for (String res : lhsTrans.getResult()) {
			if (res.contains(this.fieldName)) {
				refersToOLD = true;
			}
		}
		for (String res : rhsTrans.getResult()) {
			if (res.contains(this.fieldName)) {
				refersToOLD = true;
			}
		}
		if (refersToOLD) {
			this.result.add(this.postOldSyntax);
		}
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" > ");
		this.result.addAll(rhsTrans.getResult());
		if (refersToOLD) {
			this.result.add("} ");
		}
	}

	@Override
	public void visitGreaterEqualRelational(GreaterThanOrEqual exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTrans);
		boolean refersToOLD = false;
		for (String res : lhsTrans.getResult()) {
			if (res.contains(this.fieldName)) {
				refersToOLD = true;
			}
		}
		for (String res : rhsTrans.getResult()) {
			if (res.contains(this.fieldName)) {
				refersToOLD = true;
			}
		}
		if (refersToOLD) {
			this.result.add(this.postOldSyntax);
		}
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" >= ");
		this.result.addAll(rhsTrans.getResult());

		if (refersToOLD) {
			this.result.add("} ");
		}
	}

	@Override
	public void visitEqualityRelational(Equality exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTrans);
		boolean refersToOLD = false;
		for (String res : lhsTrans.getResult()) {
			if (res.contains(this.fieldName)) {
				refersToOLD = true;
			}
		}
		for (String res : rhsTrans.getResult()) {
			if (res.contains(this.fieldName)) {
				refersToOLD = true;
			}
		}
		if (refersToOLD) {
			this.result.add(this.postOldSyntax);
		}
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" = ");
		this.result.addAll(rhsTrans.getResult());

		if (refersToOLD) {
			this.result.add("} ");
		}
	}

	@Override
	public void visitInequivalenceRelational(Inequality exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTrans);
		boolean refersToOLD = false;
		for (String res : lhsTrans.getResult()) {
			if (res.contains(this.fieldName)) {
				refersToOLD = true;
			}
		}
		for (String res : rhsTrans.getResult()) {
			if (res.contains(this.getFieldName())) {
				refersToOLD = true;
			}
		}
		if (refersToOLD) {
			this.result.add(this.getPostOldSyntax());
		}
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" != ");
		this.result.addAll(rhsTrans.getResult());
		if (refersToOLD) {
			this.result.add("} ");
		}
	}

	@Override
	public void visitDisjunctionLogical(Disjunction exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" or ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitImplicationLogical(Implication exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" => ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitVariableLogical(Instruction exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.accept(lhsTrans);
		this.result.addAll(lhsTrans.getResult());
	}

	@Override
	public void visitEquivalenceLogical(Equivalence exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getRightExpr().accept(rhsTrans);
		this.result.addAll(lhsTrans.getResult());
		this.result.add(" = ");
		this.result.addAll(rhsTrans.getResult());
	}

	@Override
	public void visitNegationLogical(Negation exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getExpression().accept(lhsTrans);
		result.add("not");
		result.add("(");
		this.result.addAll(lhsTrans.getResult());
		result.add(")");
	}

	@Override
	public void visitConjunctionLogical(Conjunction exp) {
		Translator lhsTrans = new Translator(originalToAlloy, postOldSyntax);
		exp.getLeftExpr().accept(lhsTrans);
		Translator rhsTrans = new Translator(originalToAlloy, postOldSyntax);
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
		Translator trans = new Translator(originalToAlloy, postOldSyntax);
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
