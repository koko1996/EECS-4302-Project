package model.declaration;

import model.Declaration;
import model.Visitor;
import model.statement.assignment.expression.arithmetic.IntegerConstant;
import model.statement.assignment.expression.logical.BooleanConstant;
import model.values.Value;

import java.util.HashMap;
import java.util.Map;

/*
 * VariableInitialization Class that represents initialization of a variable
 */
public class VariableInitialization extends Declaration {
	private String id;
	private Value value;
	private String type;

	/**
	 * Constructor
	 *
	 * @param id
	 * @param type
	 */
	public VariableInitialization(String id, String type) {
		this.id = id;
		this.type = type;
		if (type.equals("bool")) {
			this.value = new Value(new BooleanConstant(false), type);
		} else if (type.equals("int")) {
			this.value = new Value(new IntegerConstant(0), type);
		}
	}
	
	/*
	 * Constructor
	 *
	 * @param id the id of the variable
	 *
	 * @param type the type of the variable (not important in this project)
	 *
	 * @param value the assigned value of the variable
	 */
	public VariableInitialization(String id, String type, Value value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}

	/**
	 * Constructor
	 *
	 * @param id
	 * @param type
	 * @param other
	 */
	public VariableInitialization(String id, String type, VariableInitialization other) {
		this.id = other.id;
		this.type = other.type;
		this.value = other.value;
	}

	/* Getter for id
	 * @return retrieve the id of the variable
	 */
	public String getID() {
		return this.id;
	}

	/* Getter for type
	 * @return retrieve the type of the variable
	 */
	public String getType() {
		return this.type;
	}

	/* Getter for value
	 * @return retrieve the value of the variable
	 */
	public Value getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.id + " " + this.type + " " + this.value.getValue();
	}

	@Override
	public void accept(Visitor visitor) {/* Not used. */}

	@Override
	public Map<String, Value> getVariables() {
		Map<String,Value> result = new HashMap<>();
		result.put(id,this.value);
		return result;
	}
}
