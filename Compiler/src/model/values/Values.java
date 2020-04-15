package model.values;

import model.statement.assignment.expression.FunctionConditional;

import java.util.HashMap;
import java.util.Map;


public abstract class Values {
    protected Map<String, Value> values;
    
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
        values.put(id, val);
    }

    public void putAll(Map<String, Value> newValues) {
        values.putAll(newValues);
    }

    public String getType(String id) {
        return this.values.get(id).getType();
    }

    public String getPrimitiveType(String id) {
        return this.values.get(id).getPrimitiveType();
    }

    public Map<String, Value> getDeclaredFunctions() {
        Map<String, Value> functions = new HashMap<>();
        for (String key : values.keySet()) {
            try {
                if (values.get(key).getValue() instanceof FunctionConditional) {
                    functions.put(key, values.get(key));
                }
            } catch (IllegalStateException e) {
                continue;
            }
        }
        return functions;
    }

}
