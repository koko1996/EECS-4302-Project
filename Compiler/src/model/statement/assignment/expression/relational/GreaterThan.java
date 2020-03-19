package model.statement.assignment.expression.relational;

import java.util.Map;

import model.Instruction;
import model.Value;
import model.Visitor;
import model.statement.assignment.expression.Relational;

public class GreaterThan extends Relational {

    public GreaterThan(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGreaterRelational(this);
    }

	@Override
	public Map<String, Value> getVariables() {
		// TODO Auto-generated method stub
		return null;
	}
}
