package model.statement.assignment.expression.logical;

import model.Instruction;

/*
 * Equivalence Class that represents equivalence expression
 */
public class Equivalence extends LogicalComposite {
    /*
     * Constructor
     *
     * @param left the left expression
     *
     * @param right the right expression
     */
    public Equivalence(Instruction left, Instruction right) {
        super(left, right);
    }

	
}
