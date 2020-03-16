package model.statement.assignment.expression.logical;

import model.Instruction;

/*
 * Disjunction Class that represents disjunction expression
 */
public class Disjunction extends LogicalComposite {

    /*
     * Constructor
     *
     * @param left the left expression
     *
     * @param right the left expression
     */
    public Disjunction(Instruction left, Instruction right) {
        super(left, right);
    }


}
