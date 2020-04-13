package model.statement.conditional;

import model.Instruction;
import model.Statement;
import model.Visitor;
import model.statement.MultiAssignment;
import model.values.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A class for IfElseIfStatements
 */
public class IfElseIfStatement extends Statement {
	private Instruction logicalCondition;
	private Instruction assignments;
	private List<ElseIfStatement> elseIfStatements;
	private IfElseIfStatement elseStatement;

	/**
	 * Constructor
	 *
	 * @param condition
	 * @param assignments
	 * @param elseIfStatements
	 * @param elseStatement
	 */
	public IfElseIfStatement(Instruction condition, Instruction assignments, List<Instruction> elseIfStatements, Instruction elseStatement) {
		this.logicalCondition = condition;
		this.assignments = assignments;
		this.elseIfStatements = new ArrayList<>();
		for (Instruction instr : elseIfStatements) {
			this.elseIfStatements.add((ElseIfStatement) instr);
		}
		if (elseStatement != null) {
			this.elseStatement = (IfElseIfStatement) elseStatement;
		}
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

	/**
	 * Getter for elseIfStatements
	 *
	 * @return the elseIfStatements
	 */
	public List<ElseIfStatement> getElseIfStatements() {
		return elseIfStatements;
	}


	/**
	 * Getter for elseStatement
	 *
	 * @return the elseStatement
	 */
	public IfElseIfStatement getElseStatement() {
		return elseStatement;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		MultiAssignment assignments = (MultiAssignment) this.assignments;
		assignments.getAssignments().forEach(each -> sb.append("\n\t").append(each));
		sb.append("else");
		sb.append(elseStatement);
		return sb.toString();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitIfConditional(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> logicalConditionVars = logicalCondition.getVariables();
		Map<String, Value> assignmentsVars = assignments.getVariables();
		Map<String, Value> ifElseIfVars = new HashMap<>();
		elseIfStatements.forEach(each -> ifElseIfVars.putAll(each.getVariables()));
		Map<String, Value> elseVars = new HashMap<>();
		if (elseStatement != null) {
			elseVars = elseStatement.getVariables();
		}
		return this.combineVariables(logicalConditionVars, assignmentsVars, ifElseIfVars, elseVars);
	}

}
