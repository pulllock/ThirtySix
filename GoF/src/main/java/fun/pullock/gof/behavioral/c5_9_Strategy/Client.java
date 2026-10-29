package fun.pullock.gof.behavioral.c5_9_Strategy;

public class Client {

    public static void main(String[] args) {

        Strategy strategy = new ConcreteStrategyA();

        Context context = new Context(strategy);

        context.execute();
    }
}