package model;

import java.util.ArrayList;
import java.util.List;

/*
 * Program class that represents an input program
 */
public class Program {
	private List<Instruction> instructions; // expressions in the program
	private List<String> variables; // variables in this program in
	// the order it is specified

	/*
	 * Constructor
	 */
	public Program() {
		this.instructions = new ArrayList<>();
	}

	/*
	 * Adds a statement to the list of statements
	 * 
	 * @param e Statement to add
	 */
	public void addInstructions(Instruction e) {
		this.instructions.add(e);
	}

	/*
	 * Get the the list of statements
	 */
	public List<Instruction> getStatments() {
		return this.instructions;
	}

	/*
	 * Get the the list of variables
	 */
	public List<String> getVariables() {
		return this.variables;
	}

	/*
	 * Set the the list of variables
	 */
	public void setVariables(List<String> variables) {
		this.variables = variables;
	}
}
