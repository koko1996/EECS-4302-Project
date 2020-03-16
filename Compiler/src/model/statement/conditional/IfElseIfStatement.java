package model.statement.conditional;

import model.Instruction;
import model.Statement;

import java.util.List;

public class IfElseIfStatement extends Statement {
	private Instruction logicalCondition;
	private Instruction assignments;
	private List<IfElseIfStatement> elseIfStatments;
	private IfElseIfStatement elseStatment;


	public IfElseIfStatement(Instruction condition, Instruction assignments, List<IfElseIfStatement> elseIfStatments) {
		this.logicalCondition = condition;
		this.assignments = assignments;
		this.elseIfStatments = elseIfStatments;
	}

	/**
	 * @return the logicalCondition
	 */
	public Instruction getCondition() {
		return logicalCondition;
	}

	/**
	 * @return the assignments
	 */
	public Instruction getAssignments() {
		return assignments;
	}

	/**
	 * @return the elseIfStatments
	 */
	public List<IfElseIfStatement> getElseIfStatments() {
		return elseIfStatments;
	}
	
	
	/**
	 * @return the elseStatment
	 */
	public IfElseIfStatement getElseStatment() {
		return elseStatment;
	}


}
