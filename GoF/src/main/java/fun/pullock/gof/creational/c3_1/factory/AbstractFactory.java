package fun.pullock.gof.creational.c3_1.factory;

import fun.pullock.gof.creational.c3_1.product.a.AbstractProductA;
import fun.pullock.gof.creational.c3_1.product.b.AbstractProductB;

public abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
