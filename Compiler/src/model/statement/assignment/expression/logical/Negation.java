package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.expression.Logical;


public class Negation extends Logical {
    private Instruction expr;

    /*
     * Constructor
     *
     * @param expr the underlying expression
     */
    public Negation(Instruction expr) {
        this.expr = expr;
    }

    /*
     * retrieve the underlying expression
     *
     * @return the underlying expression (without the negation)
     */
    public Instruction getExpression() {
        return this.expr;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitNegationLogical(this);
    }
}
