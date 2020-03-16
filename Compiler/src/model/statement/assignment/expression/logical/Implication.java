package model.statement.assignment.expression.logical;

import model.Instruction;


/*
 * Implication Class that represents implication expression
 */
public class Implication extends LogicalComposite {

    /*
     * Constructor
     *
     * @param left the left expression
     *
     * @param right the left expression
     */
    public Implication(Instruction left, Instruction right) {
        super(left, right);
    }

}
