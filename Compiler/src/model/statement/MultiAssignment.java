package model.statement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Instruction;
import model.Statement;
import model.values.Value;
import model.Visitor;
import model.statement.assignment.Expression;

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
    	visitor.visitMultipleAssignments(this);
    }

	@Override
	public Map<String, Value> getVariables() {
		Map<String,Value> result = new HashMap<>();
		for(Instruction assign: this.assignments ){
			result.putAll(assign.getVariables());
		}
		return result;
	}
	
	public Instruction clone() {
		return this; 
	}

}
