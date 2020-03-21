package model.statement.assignment.expression.arithmetic;

import java.util.Map;

import model.Instruction;
import model.Value;
import model.Visitor;
import model.statement.assignment.Expression;

public class Modulo extends ArithmeticComposite {

    public Modulo(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitModuloArithmetic(this);
    }

	@Override
	public Expression clone() {
		return new Modulo(((Expression) left).clone(),((Expression) right).clone());
	}
}
