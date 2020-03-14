package model.statement.assignment.expression.arithmetic;

import model.statement.assignment.expression.Arithmetic;

public class IntegerVariable extends Arithmetic {
	private String id;
	private int value;

	/*
	 * Constructor
	 * 
	 * @param id the id of the variable in the expression
	 * 
	 * @param value the assigned value of the variable in the expression
	 */
	public IntegerVariable(String id, int value) {
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
	public int getValue() {
		return this.value;
	}

}
