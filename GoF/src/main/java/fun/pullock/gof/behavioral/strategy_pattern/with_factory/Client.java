package fun.pullock.gof.behavioral.strategy_pattern.with_factory;

import fun.pullock.gof.behavioral.strategy_pattern.with_factory.strategy.ShippingContext;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        double fee = client.calculate("JD", 1, 10);
        System.out.println("JD fee: " + fee);

        fee = client.calculate("SF", 2, 10);
        System.out.println("SF fee: " + fee);
    }

    public double calculate(String code, double weight, double distance) {
        ShippingContext context = new ShippingContext();
        return context.executeCalculate(code, weight, distance);
    }
}
