package model.statement.assignment;

import model.Visitor;
import model.statement.Assignment;
import model.values.Value;
import model.values.ValuesGlobal;

import java.util.HashMap;
import java.util.Map;

/**
 * A class for ExpressionAssignments
 */
public class ExpressionAssignment extends Assignment {
	private String id;
	private Expression expr;

	/**
	 * Constructor
	 *
	 * @param id
	 * @param expr
	 */
	public ExpressionAssignment(String id, Expression expr) {
		this.id = id;
		this.expr = expr;
	}

	/**
	 * Getter for expr
	 *
	 * @return
	 */
	public Expression getExpr() {
		return this.expr;
	}

	/**
	 * Getter for id
	 *
	 * @return
	 */
	public String getID() {
		return this.id;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitAssignExpression(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> result = new HashMap<>();
		Value temp = new Value(expr, ValuesGlobal.getInstance().getType(id));
		result.put(id, temp);
		result.putAll(expr.getVariables());
		return result;
	}
	
	
}
