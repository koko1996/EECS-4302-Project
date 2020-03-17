package model.statement.assignment.expression.arithmetic;

import model.Instruction;
import model.Visitor;

public class Multiplication extends ArithmeticComposite {

    public Multiplication(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitMultiplicationArithmetic(this);
    }

}