package model.statement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Instruction;
import model.Statement;
import model.Value;
import model.Visitor;

public class MultiAssignment extends Statement {
    private List<Instruction> assignments;

    public MultiAssignment(List<Instruction> assignments) {
        this.assignments = assignments;
    }

    public List<Instruction> getAssignments() {
        return this.assignments;
    }

    @Override
    public void accept(Visitor visitor) {

    }

	@Override
	public Map<String, Value> getVariables() {
		Map<String,Value> result = new HashMap<>();
		assignments.forEach(each -> result.putAll(each.getVariables()));
		return result;
	}

}
