package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Visitor;

/*
 * Conjunction Class that represents conjunction expression
 */
public class Conjunction extends LogicalComposite {
    /*
     * Constructor
     *
     * @param left the left expression
     *
     * @param right the left expression
     */
    public Conjunction(Instruction left, Instruction right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConjunctionLogical(this);
    }
}
