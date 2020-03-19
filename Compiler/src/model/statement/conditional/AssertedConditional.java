package model.statement.conditional;

import model.Instruction;
import model.Statement;
import model.Value;
import model.Visitor;
import model.statement.assignment.Expression;

import java.util.Map;

public class AssertedConditional extends Statement {
	private	Instruction preCond;
	private	Instruction postCond;
	private Instruction ifStatment;
	
	
	/*
	 * @param preCond
	 * @param postCond
	 * @param ifStatment
	 */
	public AssertedConditional(Instruction preCond, Instruction postCond, Instruction ifStatment) {
		this.preCond = preCond;
		this.postCond = postCond;
		this.ifStatment = ifStatment;
	}


	/**
	 * @return the preCond
	 */
	public Instruction getPreCond() {
		return preCond;
	}


	/**
	 * @return the postCond
	 */
	public Instruction getPostCond() {
		return postCond;
	}


	/**
	 * @return the ifStatment
	 */
	public Instruction getIfStatment() {
		return ifStatment;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visitConditionalAssertionStatement(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> preCondVars = preCond.getVariables();
        System.out.println("preCondVars "+preCondVars.size());
        System.out.println("preCondVars "+preCondVars.toString());
		Map<String, Value> postCondVars = postCond.getVariables();
        System.out.println("postCondVars "+postCondVars.size());
        System.out.println("postCondVars "+postCondVars.toString());
		Map<String, Value> ifElseIfVars = ifStatment.getVariables();
        System.out.println("ifElseIfVars "+ifElseIfVars.size());
        System.out.println("ifElseIfVars "+ifElseIfVars.toString());
		return this.combineVariables(preCondVars, postCondVars, ifElseIfVars);
	}

}
