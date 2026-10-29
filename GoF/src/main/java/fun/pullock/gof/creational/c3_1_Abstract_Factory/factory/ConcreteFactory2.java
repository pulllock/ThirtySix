package fun.pullock.gof.creational.c3_1_Abstract_Factory.factory;

import fun.pullock.gof.creational.c3_1_Abstract_Factory.product.a.AbstractProductA;
import fun.pullock.gof.creational.c3_1_Abstract_Factory.product.a.ProductA2;
import fun.pullock.gof.creational.c3_1_Abstract_Factory.product.b.AbstractProductB;
import fun.pullock.gof.creational.c3_1_Abstract_Factory.product.b.ProductB2;

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
