package fun.pullock.gof.behavioral.c5_9;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.algorithmInterface();
    }
}