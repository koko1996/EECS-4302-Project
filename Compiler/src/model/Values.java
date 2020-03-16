package model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Values {
    private static Values singletonInstance;
    private Map<String, Value> values;
    private List<String> supportedTypes;

    private Values() {
        this.values = new HashMap<>();
        this.supportedTypes = new ArrayList<>();
        this.supportedTypes.add("int");
        this.supportedTypes.add("bool");
    }

    public static Values getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Values();
        }
        return singletonInstance;
    }

    public Integer getValue(String id, Integer varType) {
        // Var type is only required so that the cast can be done implicitly here. varType will be discarded.
        Value value = this.getValue(id);

        if (value.getType().equals("int")) {
            return (Integer) value.getValue();
        } else {
            throw new IllegalStateException(String.format("Variable %s is not an %s", id, "int"));
        }
    }

    public Boolean getValue(String id, Boolean varType) {
        // Var type is only required so that the cast can be done implicitly here. varType will be discarded.
        Value value = this.getValue(id);

        if (value.getType().equals("bool")) {
            return (Boolean) value.getValue();
        } else {
            throw new IllegalStateException(String.format("Variable %s is not a %s", id, "bool"));
        }
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

    public void put(String id, Object value, String type) {
//        if (type.equals("int")) {
//            type = "Integer";
//        }

//        if (type.equals("bool")) {
//            type = "Boolean";
//        }

        if (supportedTypes.contains(type)) {
            this.values.put(id, new Value(value, type));
        } else {
            throw new IllegalArgumentException(String.format("Type %s is not supported.", type));
        }
    }

    public String getType(String id) {
        return this.values.get(id).getType();
    }
}
