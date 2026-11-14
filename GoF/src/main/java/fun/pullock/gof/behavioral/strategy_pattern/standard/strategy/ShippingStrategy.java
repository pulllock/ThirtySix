package fun.pullock.gof.behavioral.strategy_pattern.standard.strategy;

public interface ShippingStrategy {

    public double calculate(double weight, double distance);
}
