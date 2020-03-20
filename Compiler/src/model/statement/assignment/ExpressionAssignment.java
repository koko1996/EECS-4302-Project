package model.statement.assignment;

import model.Value;
import model.Values;
import model.Visitor;
import model.statement.Assignment;

import java.util.HashMap;
import java.util.Map;


public class ExpressionAssignment extends Assignment {
	private String id;
	private Expression expr;

	/*
	 * Constructor
	 * 
	 * @param left the left expression
	 * 
	 * @param right the right expression
	 */
	public ExpressionAssignment(String id, Expression expr) {
		this.id = id;
		this.expr = expr;
	}


	public Expression getExpr() {
		return this.expr;
	}

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
		// TODO
		Value temp = new Value(expr, Values.getInstance().getType(id));
		result.put(id, temp);
		result.putAll(expr.getVariables());
		return result;
	}
	
	
}
