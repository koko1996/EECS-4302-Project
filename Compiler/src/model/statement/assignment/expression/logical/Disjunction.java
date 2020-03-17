package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Visitor;

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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDisjunctionLogical(this);
    }
}
