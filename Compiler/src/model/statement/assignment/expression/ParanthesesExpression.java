package model.statement.assignment.expression;

import model.Value;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.relational.LessThanOrEqual;

import java.util.HashMap;
import java.util.Map;

public class ParanthesesExpression extends Expression {
	private Expression expr;

	/*
	 * Constructor
	 *
	 * @param expr the underlying expression
	 */
	public ParanthesesExpression(Expression expr) {
		this.expr = expr;
	}

	/*
	 * retrieve the underlying expression
	 *
	 * @return the underlying expression (without the negation)
	 */
	public Expression getExpression() {
		return this.expr;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visitParanthesesExpression(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String,Value> result = new HashMap<>();
		result.putAll(this.expr.getVariables());
		return result;
	}
	
    @Override
	public Expression clone() {
		return new ParanthesesExpression(expr.clone());
	}
}
