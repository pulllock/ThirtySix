package fun.pullock.gof.structural.c4_6;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    /**
     * 享元池
     */
    private static final Map<String, Flyweight> pool = new HashMap<>();

    /**
     * 获取享元对象
     */
    public static Flyweight getFlyweight(String key) {

        if (!pool.containsKey(key)) {

            pool.put(
                    key,
                    new ConcreteFlyweight(key)
            );
        }

        return pool.get(key);
    }
}
