package fun.pullock.gof.behavioral.c5_9_Strategy;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {

        System.out.println("执行策略A");
    }
}