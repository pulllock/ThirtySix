package fun.pullock.gof.behavioral.strategy_pattern.standard;

import fun.pullock.gof.behavioral.strategy_pattern.standard.strategy.JDShippingStrategy;
import fun.pullock.gof.behavioral.strategy_pattern.standard.strategy.SFShippingStrategy;
import fun.pullock.gof.behavioral.strategy_pattern.standard.strategy.ShippingContext;
import fun.pullock.gof.behavioral.strategy_pattern.standard.strategy.ShippingStrategy;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        double fee = client.calculate("JD", 1, 10);
        System.out.println("JD fee: " + fee);

        fee = client.calculate("SF", 2, 10);
        System.out.println("SF fee: " + fee);
    }

    public double calculate(String code, double weight, double distance) {
        ShippingStrategy strategy;
        if ("SF".equals(code)) {
            strategy = new SFShippingStrategy();
        } else if ("JD".equals(code)) {
            strategy = new JDShippingStrategy();
        } else {
            throw new IllegalArgumentException("Unknown code: " + code);
        }

        ShippingContext context = new ShippingContext(strategy);
        return context.executeCalculate(weight, distance);
    }
}
