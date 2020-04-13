package model.statement.assignment.expression.relational;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Relational;
/**
 * A class for >= operator
 */
public class GreaterThanOrEqual extends Relational {
    /**
     * Constructor
     *
     * @param left
     * @param right
     */
    public GreaterThanOrEqual(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGreaterEqualRelational(this);
    }

    @Override
	public Expression clone() {
		return new GreaterThanOrEqual(((Expression) left).clone(),((Expression) right).clone());
	}
}
