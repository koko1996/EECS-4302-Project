package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import antlr.ExprBaseVisitor;

public class AntlrToInstruction extends ExprBaseVisitor<Instruction> {
	/*
	 * Given that all visit_* methods are called in a top-down fashion, we can
	 * be sure that the order in which we add declare variables into the list
	 * `vars` is identical to how they are declared in the input program.
	 */
	private List<String> vars; // stores all the variables declared in the
								// program so far
	private Map<String, Boolean> values; // Symbol table for storing values of
											// variables
	private List<String> semanticErrors; // 1. duplicate declaration 2.
											// reference to undeclared variable
	// Note that semantic errors are different from syntax errors.

	/*
	 * Constructor
	 * 
	 * @param semanticErros list of semantic errors observed in the input file
	 */
	public AntlrToInstruction(List<String> semanticErrors) {
		vars = new ArrayList<>();
		values = new HashMap<String, Boolean>();
		this.semanticErrors = semanticErrors;
	}
	
	/*
	 * getter function to retrieve list of variables defined in the input file
	 * 
	 * @param list of strings representing the variable names in the input
	 * program
	 */
	public List<String> getVars() {
		return vars;
	}

}
