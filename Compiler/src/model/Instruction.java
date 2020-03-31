package model;

import java.util.HashMap;
import java.util.Map;

import model.values.Value;

public abstract class Instruction {

    public abstract void accept(Visitor visitor);

    public abstract Map<String, Value> getVariables();

    @SafeVarargs
    protected final Map<String, Value> combineVariables(Map<String, Value>... vars) {
        Map<String, Value> result = new HashMap<>();
        for(Map<String, Value> mp:vars){
        	if(mp!=null){
        		result.putAll(mp);	
        	}
        	
        }
        return result;
    }
}
