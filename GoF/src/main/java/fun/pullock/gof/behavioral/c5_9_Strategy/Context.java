package fun.pullock.gof.behavioral.c5_9_Strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.algorithmInterface();
    }
}