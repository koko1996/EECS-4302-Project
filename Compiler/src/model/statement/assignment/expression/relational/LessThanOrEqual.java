package model.statement.assignment.expression.relational;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.expression.Relational;

public class LessThanOrEqual extends Relational {

    public LessThanOrEqual(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLessEqualRelational(this);
    }
}
