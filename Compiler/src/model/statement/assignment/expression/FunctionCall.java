package model.statement.assignment.expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Instruction;
import model.Visitor;
import model.statement.assignment.Expression;
import model.statement.assignment.expression.arithmetic.IntegerConstant;
import model.statement.assignment.expression.logical.BooleanConstant;
import model.values.Value;

public class FunctionCall extends Expression{

	private String id;
	private String type;
	private List<Instruction>  parameters;

	public FunctionCall(String id, String type, List<Instruction> parameters) {
		this.id = id;
		this.type = type;
		this.parameters = parameters;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the parameters
	 */
	public List<Instruction> getParameters() {
		return parameters;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	@Override
	public Expression clone() {
		List<Instruction> copyParameters = new ArrayList<>();
		for(Instruction expr: this.parameters){
			copyParameters.add(((Expression) expr).clone());
		}
		return new FunctionCall(id,type,copyParameters);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitFunctionCall(this);
		
	}

	@Override
	public Map<String, Value> getVariables() {
		Map<String, Value> result = new HashMap<>();
		for(Instruction expr: this.parameters){
			if((expr instanceof BooleanConstant)){
				Value val = new Value((Expression) expr,"Bool");
				result.put(expr.toString(),val);
			} else if ((expr instanceof IntegerConstant)){
				Value val = new Value((Expression) expr,"Int");
				result.put(expr.toString(),val);
			} else {
				result.putAll(expr.getVariables());
			}
		}
		return result;
	}

}
