package model.statement;

import model.Instruction;
import model.Statement;
import model.Visitor;
import model.values.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A container class for Multiple Assignments
 */
public class MultiAssignment extends Statement {
	private List<Instruction> assignments; // Container for assignments

	/**
	 * Constructor
	 *
	 * @param assignments
	 */
	public MultiAssignment(List<Instruction> assignments) {
		this.assignments = assignments;
	}

	/**
	 * Assignment List getter
	 *
	 * @return
	 */
	public List<Instruction> getAssignments() {
		return this.assignments;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitMultipleAssignments(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> result = new HashMap<>();
		for (Instruction assign : this.assignments) {
			result.putAll(assign.getVariables());
		}
		return result;
	}

	/**
	 * Returns a clone
	 *
	 * @return
	 */
	public Instruction clone() {
		return this;
	}

}
