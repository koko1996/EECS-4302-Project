package model;


import model.statement.assignment.Expression;
import model.statement.assignment.expression.Arithmetic;
import model.statement.assignment.expression.Logical;
import model.statement.assignment.expression.ParanthesesExpression;
import model.statement.assignment.expression.Relational;
import model.statement.assignment.expression.arithmetic.IntegerConstant;
import model.statement.assignment.expression.logical.BooleanConstant;

import java.util.HashMap;
import java.util.Map;

public class Values {
    private static Values singletonInstance;
    private Map<String, Value> values;
    
    private Values() {
        this.values = new HashMap<>();
    }

    public static Values getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Values();
        }
        return singletonInstance;
    }

    public Value getValue(String id) {
        if (this.values.containsKey(id)) {
            return this.values.get(id);
        } else {
            throw new IllegalStateException(String.format("Variable %s is not declared yet!", id));
        }
    }

    public boolean containsKey(String id) {
        return this.values.containsKey(id);
    }
    
    public void put(String id, Value val) {
        values.put(id,val);
    }

    public String getType(String id) {
        return this.values.get(id).getType();
    }

}
