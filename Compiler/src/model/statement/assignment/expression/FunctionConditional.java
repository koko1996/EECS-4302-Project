package model.statement.assignment.expression;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;
import model.values.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A class for FunctionConditionals.
 */
public class FunctionConditional extends Expression {
	private String name;
	private String returnType;
	private List<Instruction> parameters;
	private Instruction preCond;
	private Instruction postCond;
	private Instruction assignments;
	private String returnVariable;


	/* Constructor
	 * @param preCond
	 * @param postCond
	 * @param ifStatement
	 */
	public FunctionConditional(String name, String returnType, List<Instruction> parameters, Instruction preCond, Instruction postCond, Instruction assignments, String returnVariable) {
		this.name = name;
		this.returnType = returnType;
		this.parameters = parameters;
		this.preCond = preCond;
		this.postCond = postCond;
		this.assignments = assignments;
		this.returnVariable = returnVariable;
	}

	/**
	 * Getter for name
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for returnType
	 *
	 * @return the returnType
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * Getter for parameters
	 *
	 * @return the parameters
	 */
	public List<Instruction> getParameters() {
		return parameters;
	}

	/**
	 * Getter for preCond
	 *
	 * @return the preCond
	 */
	public Instruction getPreCond() {
		return preCond;
	}

	/**
	 * Getter for postCond
	 *
	 * @return the postCond
	 */
	public Instruction getPostCond() {
		return postCond;
	}

	/**
	 * Getter for assignments
	 *
	 * @return the assignments
	 */
	public Instruction getAssignments() {
		return assignments;
	}

	/**
	 * Getter for returnVariable
	 *
	 * @return the returnExpression
	 */
	public String getReturnVariable() {
		return returnVariable;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitFunctionConditional(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> result = new HashMap<>();
		for (Instruction parameter : parameters) {
			result = this.combineVariables(result, parameter.getVariables());
		}
		return result;
	}

	@Override
	public Expression clone() {
		return this;
	}


}

