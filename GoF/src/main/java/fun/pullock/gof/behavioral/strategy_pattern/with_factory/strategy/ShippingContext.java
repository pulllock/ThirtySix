package fun.pullock.gof.behavioral.strategy_pattern.with_factory.strategy;

import java.util.HashMap;
import java.util.Map;

public class ShippingContext {

    private static final Map<String, ShippingStrategy> STRATEGY_MAP = new HashMap<>();

    static {
        register("SF", new SFShippingStrategy());
        register("JD", new JDShippingStrategy());
    }

    public static void register(String code, ShippingStrategy strategy) {
        STRATEGY_MAP.put(code, strategy);
    }


    public double executeCalculate(String code, double weight, double distance) {
        ShippingStrategy strategy = STRATEGY_MAP.get(code);
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown strategy: " + code);
        }
        return strategy.calculate(weight, distance);
    }
}
