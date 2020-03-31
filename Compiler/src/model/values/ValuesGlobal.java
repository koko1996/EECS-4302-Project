package model.values;

import java.util.HashMap;

public class ValuesGlobal extends Values {
    private static ValuesGlobal singletonInstance;
    
    private ValuesGlobal() {
        this.values = new HashMap<>();
    }

    public static ValuesGlobal getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new ValuesGlobal();
        }
        return singletonInstance;
    }
}
