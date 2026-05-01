package fun.pullock.gof.creational.c3_1.factory;

import fun.pullock.gof.creational.c3_1.product.a.AbstractProductA;
import fun.pullock.gof.creational.c3_1.product.a.ProductA2;
import fun.pullock.gof.creational.c3_1.product.b.AbstractProductB;
import fun.pullock.gof.creational.c3_1.product.b.ProductB2;

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
