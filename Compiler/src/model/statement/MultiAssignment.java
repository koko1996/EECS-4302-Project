package model.statement;

import model.Instruction;
import model.Statement;

import java.util.List;

public class MultiAssignment extends Statement {
    private List<Instruction> assignments;

    public MultiAssignment(List<Instruction> assignments) {
        this.assignments = assignments;
    }

    public List<Instruction> getAssignments() {
        return this.assignments;
    }

//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		assignments.forEach(each -> sb.append(each.toString()).append("\n"));
//		return sb.toString();
//	}
}
