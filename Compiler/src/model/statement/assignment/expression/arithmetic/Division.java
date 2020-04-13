package model.statement.assignment.expression.arithmetic;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;

public class Division extends ArithmeticComposite {
    /**
     * Constructor
     *
     * @param left
     * @param right
     */
    public Division(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDivisionArithmetic(this);
    }

    @Override
	public Expression clone() {
		return new Division(((Expression) left).clone(),((Expression) right).clone());
	}
}
