package model.statement.assignment.expression.arithmetic;

import model.Instruction;
import model.Visitor;

public class Division extends ArithmeticComposite {

    public Division(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDivisionArithmetic(this);
    }
}
