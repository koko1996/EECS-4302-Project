package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class Instruction {

    public abstract void accept(Visitor visitor);

    public abstract Map<String, Value> getVariables();

    @SafeVarargs
    protected final Map<String, Value> combineVariables(Map<String, Value>... vars) {
        Map<String, Value> result = new HashMap<>();
        Arrays.asList(vars).forEach(result::putAll);
        return result;
    }
}
