package fun.pullock.gof.behavioral.c5_3;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, Integer> variables = new HashMap<>();

    public void assign(String key, Integer value) {
        variables.put(key, value);
    }

    public int getValue(String key) {
        return variables.get(key);
    }
}
