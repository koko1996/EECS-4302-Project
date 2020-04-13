package model.statement.assignment.expression.relational;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Relational;
/**
 * A class for != operator
 */
public class Inequality extends Relational {
    /**
     * Constructor
     *
     * @param left
     * @param right
     */
    public Inequality(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitInequivalenceRelational(this);
    }

    @Override
	public Expression clone() {
		return new Inequality(((Expression) left).clone(),((Expression) right).clone());
	}
}
