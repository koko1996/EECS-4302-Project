package model.statement.assignment.expression.arithmetic;

import model.values.Value;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Arithmetic;

import java.util.HashMap;
import java.util.Map;

public class IntegerVariable extends Arithmetic {
	private String id;
	private Expression value;

	/*
	 * Constructor
	 *
	 * @param id the id of the variable in the expression
	 *
	 * @param value the assigned value of the variable in the expression
	 */
	public IntegerVariable(String id, Expression value) {
		this.id = id;
		this.value = value;
	}

	/*
	 * retrieve the id of the variable expression
	 *
	 * @return retrieve the id of the variable expression
	 */
	public String getID() {
		return this.id;
	}

	/*
	 * retrieve the value of the variable expression
	 *
	 * @return retrieve the value of the variable expression
	 */
	public Expression getValue() {
		return this.value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitIntegerVariable(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> result = new HashMap<>();
		Value val = new Value(value, "int");
		result.put(id,val);
		return result;
	}

	@Override
	public Expression clone() {
		return new IntegerVariable(id,value.clone());
	}
}
