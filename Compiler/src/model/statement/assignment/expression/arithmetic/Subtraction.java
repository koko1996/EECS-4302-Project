package model.statement.assignment.expression.arithmetic;

import model.Instruction;
import model.Visitor;

public class Subtraction extends ArithmeticComposite {

    public Subtraction(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSubtractionArithmetic(this);
    }
}