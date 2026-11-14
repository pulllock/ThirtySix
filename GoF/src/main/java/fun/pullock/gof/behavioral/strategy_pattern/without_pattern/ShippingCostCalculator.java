package fun.pullock.gof.behavioral.strategy_pattern.without_pattern;

public class ShippingCostCalculator {

    public double calculate(String code, double weight, double distance) {
        if ("SF".equals(code)) {
            double base = 18.0;
            return base + (weight * 6) + (distance * 0.6);
        } else if ("JD".equals(code)) {
            double base = 15.0;
            return base + (weight * 7) + (distance * 0.7);
        } else {
            throw new IllegalArgumentException("Unknown code: " + code);
        }
    }
}
