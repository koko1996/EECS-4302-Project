package model.statement.assignment.expression;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Instruction;
import model.Statement;
import model.values.Value;
import model.Visitor;
import model.statement.assignment.Expression;

public class FunctionConditional extends Expression{
	private String name; 
	private String returnType;
	private List<Instruction> parameters;
	private	Instruction preCond;
	private	Instruction postCond;
	private Instruction assignments;
	private String returnVariable;
	
	
	/*
	 * @param preCond
	 * @param postCond
	 * @param ifStatment
	 */
	public FunctionConditional(String name, String returnType, List<Instruction> parameters,Instruction preCond, Instruction postCond,Instruction assignments, String returnVariable){   
		this.name= name;
		this.returnType= returnType;
		this.parameters = parameters;
		this.preCond = preCond;
		this.postCond = postCond;
		this.assignments =assignments;
		this.returnVariable = returnVariable;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @return the returnType
	 */
	public String getReturnType() {
		return returnType;
	}



	/**
	 * @return the parameters
	 */
	public List<Instruction> getParameters() {
		return parameters;
	}



	/**
	 * @return the preCond
	 */
	public Instruction getPreCond() {
		return preCond;
	}



	/**
	 * @return the postCond
	 */
	public Instruction getPostCond() {
		return postCond;
	}



	/**
	 * @return the assignments
	 */
	public Instruction getAssignments() {
		return assignments;
	}



	/**
	 * @return the returnExpression
	 */
	public String getReturnVariable() {
		return returnVariable;
	}



	@Override
	public void accept(Visitor visitor) {
		visitor.visitFucntionConditional(this);
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> result = new HashMap<>();
		for(int i=0;i<parameters.size();i++){
			result = this.combineVariables(result,parameters.get(i).getVariables());
		}
				
		return result;
	}



	@Override
	public Expression clone() {
		// TODO Auto-generated method stub
		return null;
	}


}

