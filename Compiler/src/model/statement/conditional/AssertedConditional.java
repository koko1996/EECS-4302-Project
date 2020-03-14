package model.statement.conditional;

import model.Statement;
import model.statement.assignment.Expression;

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
	
	
	
}
