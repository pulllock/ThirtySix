package fun.pullock.gof.structural.c4_2_Bridge.abstraction;

import fun.pullock.gof.structural.c4_2_Bridge.implemenation.Implementor;

public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
