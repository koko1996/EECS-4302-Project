package model.statement.assignment.expression.arithmetic;

import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.Arithmetic;
import model.values.Value;

import java.util.HashMap;
import java.util.Map;

public class IntegerConstant extends Arithmetic {
	private int value;

	/*
	 * Constructor
	 * @param value the assigned value of the variable in the expression
	 */
	public IntegerConstant(int value) {
		this.value = value;
	}


	/* Getter for value
	 * @return retrieve the value of the variable expression
	 */
	public int getValue() {
		return this.value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitIntegerConstant(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String,Value> result = new HashMap<>();
		return result;
	}
	
    @Override
	public Expression clone() {
		return new IntegerConstant(value);
	}
    
    @Override
    public String toString() {
		return Integer.toString(value);
    }
}

