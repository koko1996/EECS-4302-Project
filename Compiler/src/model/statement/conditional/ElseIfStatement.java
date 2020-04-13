package model.statement.conditional;

import model.Instruction;
import model.Statement;
import model.Visitor;
import model.values.Value;

import java.util.Map;

/**
 * A class for ElseIfStatements
 */
public class ElseIfStatement extends Statement {
	private Instruction logicalCondition;
	private Instruction assignments;

	/**
	 * Constructor
	 *
	 * @param condition
	 * @param assignments
	 */
	public ElseIfStatement(Instruction condition, Instruction assignments) {
		this.logicalCondition = condition;
		this.assignments = assignments;
	}

	/**
	 * Getter for logicalCondition
	 *
	 * @return the logicalCondition
	 */
	public Instruction getCondition() {
		return logicalCondition;
	}

	/**
	 * Getter for assignments
	 *
	 * @return the assignments
	 */
	public Instruction getAssignments() {
		return assignments;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visitElseIfConditional(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> logicalConditionVars = logicalCondition.getVariables();
		Map<String, Value> assignmentsVars = assignments.getVariables();
		return this.combineVariables(logicalConditionVars, assignmentsVars);
	}

}
