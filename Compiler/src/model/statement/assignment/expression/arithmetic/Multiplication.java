package model.statement.assignment.expression.arithmetic;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;

public class Multiplication extends ArithmeticComposite {

    public Multiplication(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitMultiplicationArithmetic(this);
    }
	
    
    @Override
	public Expression clone() {
		return new Multiplication(((Expression) left).clone(),((Expression) right).clone());
	}
}