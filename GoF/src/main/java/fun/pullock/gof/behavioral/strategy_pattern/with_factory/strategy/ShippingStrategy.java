package fun.pullock.gof.behavioral.strategy_pattern.with_factory.strategy;

public interface ShippingStrategy {

    public double calculate(double weight, double distance);
}
