package model.statement.conditional;

import model.Instruction;
import model.Statement;
import model.Visitor;
import model.values.Value;

import java.util.Map;

/**
 * A class for AssertedConditionals
 */
public class AssertedConditional extends Statement {
	private Instruction preCond;
	private Instruction postCond;
	private Instruction ifStatement;


	/**
	 * Constructor
	 *
	 * @param preCond
	 * @param postCond
	 * @param ifStatement
	 */
	public AssertedConditional(Instruction preCond, Instruction postCond, Instruction ifStatement) {
		this.preCond = preCond;
		this.postCond = postCond;
		this.ifStatement = ifStatement;
	}


	/**
	 * Getter for preCond
	 *
	 * @return the preCond
	 */
	public Instruction getPreCond() {
		return preCond;
	}


	/**
	 * Getter for postCond
	 *
	 * @return the postCond
	 */
	public Instruction getPostCond() {
		return postCond;
	}


	/**
	 * Getter for ifStatement
	 *
	 * @return the ifStatement
	 */
	public Instruction getIfStatement() {
		return ifStatement;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visitConditionalAssertionStatement(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> preCondVars = preCond.getVariables();
		Map<String, Value> postCondVars = postCond.getVariables();
		Map<String, Value> ifElseIfVars = ifStatement.getVariables();
		return this.combineVariables(preCondVars, postCondVars, ifElseIfVars);
	}

}
