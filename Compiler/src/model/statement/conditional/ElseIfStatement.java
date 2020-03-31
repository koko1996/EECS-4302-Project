package model.statement.conditional;

import java.util.Map;

import model.Instruction;
import model.Statement;
import model.Visitor;
import model.values.Value;

public class ElseIfStatement extends Statement {
	private Instruction logicalCondition;
	private Instruction assignments;

	public ElseIfStatement(Instruction condition, Instruction assignments) {
		this.logicalCondition = condition;
		this.assignments = assignments;
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


	@Override
	public void accept(Visitor visitor) {
        visitor.visitElseIfConditional(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> logicalConditionVars = logicalCondition.getVariables();
//        System.out.println("logicalConditionVars "+logicalConditionVars.size());
//        System.out.println("logicalConditionVars "+logicalConditionVars.toString());
		Map<String, Value> assignmentsVars = assignments.getVariables();
//        System.out.println("assignmentsVars "+assignmentsVars.size());
//        System.out.println("assignmentsVars "+assignmentsVars.toString());

		
		return this.combineVariables(logicalConditionVars, assignmentsVars);
	}

}
