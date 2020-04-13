package model.statement.assignment.expression.logical;

import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Logical;
import model.values.Value;

import java.util.HashMap;
import java.util.Map;

public class BooleanConstant extends Logical{
	private boolean value;

	/*
	 * Constructor
	 *
	 * @param value the assigned value of the variable in the expression
	 */
	public BooleanConstant(boolean value) {
		this.value = value;
	}

	/* Getter vor value
	 * @return retrieve the value of the variable expression
	 */
	public boolean getValue() {
		return this.value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitBooleanConstant(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String,Value> result = new HashMap<>();
		return result;
	}

	@Override
	public Expression clone() {
		return new BooleanConstant(value);
	}
	
    @Override
    public String toString() {
    	String result = Boolean.toString(value);
		return result.substring(0, 1).toUpperCase() + result.substring(1);
    }
}
