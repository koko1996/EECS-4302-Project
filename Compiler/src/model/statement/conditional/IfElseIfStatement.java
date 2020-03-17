package model.statement.conditional;

import java.util.List;

import model.Statement;
import model.statement.MultiAssignment;
import model.statement.assignment.expression.Logical;

public class IfElseIfStatement extends Statement{
	private Logical logicalCondition;
	private MultiAssignment assignments;
	private List<IfElseIfStatement> elseIfStatments;
	private IfElseIfStatement elseStatment;	


	public IfElseIfStatement(Logical condition, MultiAssignment assignments, List<IfElseIfStatement> elseIfStatments) {
		this.logicalCondition = condition;
		this.assignments=assignments;
		this.elseIfStatments = elseIfStatments;
	}

	/**
	 * @return the logicalCondition
	 */
	public Logical getCondition() {
		return logicalCondition;
	}

	/**
	 * @return the assignments
	 */
	public MultiAssignment getAssignments() {
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
