package model.values;

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
        values.put(id,val);
    }

    public String getType(String id) {
        return this.values.get(id).getType();
    }
}
