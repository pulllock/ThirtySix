package fun.pullock.gof.behavioral.strategy_pattern.with_factory.strategy;

public class SFShippingStrategy implements ShippingStrategy {

    @Override
    public double calculate(double weight, double distance) {
        double base = 18.0;
        return base + (weight * 6) + (distance * 0.6);
    }
}
