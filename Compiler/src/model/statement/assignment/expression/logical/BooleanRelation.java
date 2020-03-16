package model.statement.assignment.expression.logical;

import model.Instruction;
import model.statement.assignment.expression.Logical;

public class BooleanRelation extends Logical {
    private Instruction expr;

    /*
     * Constructor
     *
     * @param value the assigned value of the variable in the expression
     */
    public BooleanRelation(Instruction expr) {
        this.expr = expr;
    }

    /*
     * retrieve the value of the variable expression
     *
     * @return retrieve the value of the variable expression
     */
    public Instruction getValue() {
        return this.expr;
    }

}
