package model.statement.assignment.expression.relational;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;
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
	public Expression clone() {
		return new GreaterThan(((Expression) left).clone(),((Expression) right).clone());
	}
}
