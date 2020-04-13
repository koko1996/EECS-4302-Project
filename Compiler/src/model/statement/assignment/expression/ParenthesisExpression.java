package model.statement.assignment.expression;

import model.Visitor;
import model.statement.assignment.Expression;
import model.values.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * A class for ParenthesisExpressions
 */
public class ParenthesisExpression extends Expression {
	private Expression expr;

	/**
	 * Constructor
	 *
	 * @param expr the underlying expression
	 */
	public ParenthesisExpression(Expression expr) {
		this.expr = expr;
	}

	/**
	 * Getter for expr
	 *
	 * @return the underlying expression (without the negation)
	 */
	public Expression getExpression() {
		return this.expr;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visitParenthesisExpression(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		return new HashMap<>(this.expr.getVariables());
	}
	
    @Override
	public Expression clone() {
		return new ParenthesisExpression(expr.clone());
    }
}
