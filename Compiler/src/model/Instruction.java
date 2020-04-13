package model;

import model.values.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * An abstract class for Instruction
 */
public abstract class Instruction {

    /**
     * The accept method for visitor.
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);

    /**
     * Returns all variables in the object as well as their values.
     *
     * @return Map<String, Value>
     */
    public abstract Map<String, Value> getVariables();

    /**
     * Combines any given number of Variable Maps into one.
     *
     * @param vars
     * @return Map<String, Value>
     */
    @SafeVarargs
    protected final Map<String, Value> combineVariables(Map<String, Value>... vars) {
        Map<String, Value> result = new HashMap<>();
        for (Map<String, Value> mp : vars) {
            if (mp != null) {
                result.putAll(mp);
            }
        }
        return result;
    }
}
