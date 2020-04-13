package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Logical;
import model.values.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * A class for ! operator
 */
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

    /* Getter for expr
     * @return the underlying expression (without the negation)
     */
    public Instruction getExpression() {
        return this.expr;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitNegationLogical(this);
    }

    @Override
    public Map<String, Value> getVariables() {
        return new HashMap<>(this.expr.getVariables());
    }

    @Override
    public Expression clone() {
        return new Negation(((Expression) expr).clone());
    }
}
