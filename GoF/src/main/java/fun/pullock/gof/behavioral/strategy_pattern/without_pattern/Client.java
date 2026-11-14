package fun.pullock.gof.behavioral.strategy_pattern.without_pattern;

public class Client {

    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        double fee = calculator.calculate("SF", 1, 10);
        System.out.println("SF fee: " + fee);

        fee = calculator.calculate("JD", 2, 10);
        System.out.println("JD fee: " + fee);
    }
}
