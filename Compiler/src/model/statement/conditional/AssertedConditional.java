package model.statement.conditional;

import model.Statement;
import model.Value;
import model.Visitor;
import model.statement.assignment.Expression;

import java.util.Map;

public class AssertedConditional extends Statement {
	private	Expression preCond;
	private	Expression postCond;
	private IfElseIfStatement ifStatment;
	
	
	/*
	 * @param preCond
	 * @param postCond
	 * @param ifStatment
	 */
	public AssertedConditional(Expression preCond, Expression postCond, IfElseIfStatement ifStatment) {
		this.preCond = preCond;
		this.postCond = postCond;
		this.ifStatment = ifStatment;
	}


	/**
	 * @return the preCond
	 */
	public Expression getPreCond() {
		return preCond;
	}


	/**
	 * @return the postCond
	 */
	public Expression getPostCond() {
		return postCond;
	}


	/**
	 * @return the ifStatment
	 */
	public IfElseIfStatement getIfStatment() {
		return ifStatment;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visitConditionalAssertionStatement(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> preCondVars = preCond.getVariables();
		Map<String, Value> pastCondVars = postCond.getVariables();
		Map<String, Value> ifElseIfVars = ifStatment.getVariables();
		return this.combineVariables(preCondVars, pastCondVars, ifElseIfVars);
	}

}
