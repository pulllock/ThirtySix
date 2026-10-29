package fun.pullock.gof.creational.c3_1_Abstract_Factory.factory;

import fun.pullock.gof.creational.c3_1_Abstract_Factory.product.a.AbstractProductA;
import fun.pullock.gof.creational.c3_1_Abstract_Factory.product.b.AbstractProductB;

public abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
