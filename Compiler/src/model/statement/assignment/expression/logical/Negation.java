package model.statement.assignment.expression.logical;

import java.util.HashMap;
import java.util.Map;

import model.Instruction;
import model.Value;
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

	@Override
	public Map<String, Value> getVariables() {
		Map<String,Value> result = new HashMap<>();
		result.putAll(this.expr.getVariables());
		return result;
	}
}
