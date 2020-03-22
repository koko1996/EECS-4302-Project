package model.statement.assignment.expression.logical;

import model.Instruction;
import model.Value;
import model.Visitor;
import model.statement.assignment.expression.Logical;

import java.util.HashMap;
import java.util.Map;


public abstract class LogicalComposite extends Logical {
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
        // We will not need this unless we want visitor classes other than Translator.
    }

	@Override
	public Map<String, Value> getVariables() {
		Map<String,Value> result = new HashMap<>();
		result.putAll(this.left.getVariables());
		result.putAll(this.right.getVariables());
		return result;
	}
}
