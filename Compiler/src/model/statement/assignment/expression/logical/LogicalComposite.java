package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.expression.Logical;


public class LogicalComposite extends Logical {
    protected Instruction left;
    protected Instruction right;

    /*
     * Constructor
     *
     * @param left the left expression
     *
     * @param right the right expression
     */
    public LogicalComposite(Instruction left, Instruction right) {
        this.left = left;
        this.right = right;
    }

    /*
     * getter for the left expression
     *
     * @return Expression representing the left expression
     */
    public Instruction getLeftExpr() {
        return this.left;
    }

    /*
     * getter for the left expression
     *
     * @return Expression representing the left expression
     */
    public Instruction getRightExpr() {
        return this.right;
    }

    @Override
    public void accept(Visitor visitor) {
        //TODO
    }

}
