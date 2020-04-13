package model.statement.assignment.expression.relational;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Relational;

/**
 * A class for <= operator
 */
public class LessThanOrEqual extends Relational {
    /**
     * Constructor
     *
     * @param left
     * @param right
     */
    public LessThanOrEqual(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLessEqualRelational(this);
    }


    @Override
    public Expression clone() {
        return new LessThanOrEqual(((Expression) left).clone(), ((Expression) right).clone());
    }
}
