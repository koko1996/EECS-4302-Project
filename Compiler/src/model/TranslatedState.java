package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.statement.assignment.Expression;
import model.statement.assignment.expression.arithmetic.IntegerVariable;
import model.statement.assignment.expression.logical.BooleanVariable;

public class TranslatedState {
	private Map<String,String> varMap;
	private List<Expression> expressions;
	
	public TranslatedState(){;
		this.varMap = new  HashMap<>();	
		this.expressions = new ArrayList<>();
	}

	/**
	 * @return the varMap
	 */
	public Map<String, String> getVarMap() {
		return varMap;
	}

	/**
	 * @param 
	 */
	public void appendToVarMap(String key, String value) {
		this.varMap.put(key, value);
	}

	/**
	 * @return the expressions
	 */
	public List<Expression> getExpressions() {
		return expressions;
	}

	/**
	 * @param e expression to add to the expressions list
	 */
	public void appendToExpressions(Expression e) {
		this.expressions.add(e);
	}
	
	

}
