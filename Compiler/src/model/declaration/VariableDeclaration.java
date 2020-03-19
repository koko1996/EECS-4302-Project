package model.declaration;

import java.util.Map;

import model.Declaration;
import model.Value;
import model.Visitor;


/*
 * VariableDeclaration Class that represents declaration of a variable
 * REMOVE THIS CLASS
 */
public class VariableDeclaration extends Declaration {
	private String id;
	private String type;

	/*
	 * Constructor
	 * 
	 * @param id the id of the variable
	 * 
	 * @param value the assigned value of the variable
	 */
	public VariableDeclaration(String id, String type) {
		this.id = id;
		this.type = type;
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
	 * retrieve the value of the variable
	 * 
	 * @return retrieve the value of the variable
	 */
	public String getType() {
		return this.type;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Value> getVariables() {
		// TODO
		return null;
	}

}
