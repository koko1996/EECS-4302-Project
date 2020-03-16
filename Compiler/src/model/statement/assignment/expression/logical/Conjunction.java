package model.statement.assignment.expression.logical;

import model.Instruction;

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
}
