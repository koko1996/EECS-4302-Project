package model.statement.assignment.expression.relational;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.expression.Relational;

public class GreaterThanOrEqual extends Relational {

    public GreaterThanOrEqual(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGreaterEqualRelational(this);
    }
}
