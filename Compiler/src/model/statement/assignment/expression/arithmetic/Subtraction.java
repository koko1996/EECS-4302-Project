package model.statement.assignment.expression.arithmetic;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;

public class Subtraction extends ArithmeticComposite {
    /**
     * Constructor
     *
     * @param left
     * @param right
     */
    public Subtraction(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSubtractionArithmetic(this);
    }

    @Override
	public Expression clone() {
		return new Subtraction(((Expression) left).clone(),((Expression) right).clone());
	}
}