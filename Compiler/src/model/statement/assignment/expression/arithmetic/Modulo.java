package model.statement.assignment.expression.arithmetic;

import model.Instruction;
import model.Visitor;

public class Modulo extends ArithmeticComposite {

    public Modulo(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitModuloArithmetic(this);
    }

}
