package model.statement.assignment.expression.arithmetic;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;

public class Addition extends ArithmeticComposite {
	/**
	 * Constructor
	 *
	 * @param left
	 * @param right
	 */
	public Addition(Instruction left, Instruction right) {
		super(left, right);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitAdditionArithmetic(this);
	}

	@Override
	public Expression clone() {
		return new Addition(((Expression) left).clone(),((Expression) right).clone());
	}

}