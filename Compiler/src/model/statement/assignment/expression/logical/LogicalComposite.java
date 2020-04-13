package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.expression.Logical;
import model.values.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * An abstract class for composite logical operations
 */
public abstract class LogicalComposite extends Logical {
    protected Instruction left;
    protected Instruction right;

    /**
     * Constructor
     *
     * @param left the left expression
     * @param right the right expression
     */
    public LogicalComposite(Instruction left, Instruction right) {
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

    /**
     * Getter for right
     *
     * @return Expression representing the right expression
     */
    public Instruction getRightExpr() {
        return this.right;
    }

    @Override
    public void accept(Visitor visitor) {
        // No need to implement.
    }

    @Override
    public Map<String, Value> getVariables() {
        Map<String, Value> result = new HashMap<>();
        result.putAll(this.left.getVariables());
        result.putAll(this.right.getVariables());
        return result;
    }
}
