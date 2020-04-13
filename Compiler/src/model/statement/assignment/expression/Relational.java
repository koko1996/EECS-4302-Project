package model.statement.assignment.expression;

import model.Instruction;
import model.statement.assignment.Expression;
import model.values.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * An abstract class for Relational operations
 */
public abstract class Relational extends Expression {
    protected Instruction left;
    protected Instruction right;

    /**
     * Constructor
     *
     * @param left  the left expression
     * @param right the right expression
     */
    public Relational(Instruction left, Instruction right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Getter for left
     *
     * @return Expression representing the left expression
     */
    public Instruction getLeftExpr() {
        return this.left;
    }

    /** Getter for right
     * @return Expression representing the left expression
     */
    public Instruction getRightExpr() {
        return this.right;
    }

    @Override
    public Map<String, Value> getVariables() {
        Map<String, Value> result = new HashMap<>();
        result.putAll(this.left.getVariables());
        result.putAll(this.right.getVariables());
        return result;
    }

}
