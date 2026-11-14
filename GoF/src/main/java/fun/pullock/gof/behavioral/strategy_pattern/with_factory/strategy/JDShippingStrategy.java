package fun.pullock.gof.behavioral.strategy_pattern.with_factory.strategy;

public class JDShippingStrategy implements ShippingStrategy {

    @Override
    public double calculate(double weight, double distance) {
        double base = 15.0;
        return base + (weight * 7) + (distance * 0.7);
    }
}
