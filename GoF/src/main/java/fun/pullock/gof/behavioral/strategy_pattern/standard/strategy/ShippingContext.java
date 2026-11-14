package fun.pullock.gof.behavioral.strategy_pattern.standard.strategy;

public class ShippingContext {

    private ShippingStrategy strategy;

    public ShippingContext(ShippingStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeCalculate(double weight, double distance) {
        return strategy.calculate(weight, distance);
    }
}
