package model.declaration;

import model.Declaration;
import model.Value;

/*
 * VariableInitialization Class that represents initialization of a variable
 */
public class VariableInitialization extends Declaration {
	private String id;
	private Value value;
	private String type;

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

	/*
	 * retrieve the id of the variable
	 * 
	 * @return retrieve the id of the variable
	 */
	public String getID() {
		return this.id;
	}

	/*
	 * retrieve the type of the variable
	 * 
	 * @return retrieve the type of the variable
	 */
	public String getType() {
		return this.type;
	}

	/*
	 * retrieve the value of the variable
	 *
	 * @return retrieve the value of the variable
	 */
	public Value getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.id + " " + this.type + " " + this.value;
	}
}
