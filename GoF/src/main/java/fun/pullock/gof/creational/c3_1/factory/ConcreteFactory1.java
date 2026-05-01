package fun.pullock.gof.creational.c3_1.factory;

import fun.pullock.gof.creational.c3_1.product.a.AbstractProductA;
import fun.pullock.gof.creational.c3_1.product.a.ProductA1;
import fun.pullock.gof.creational.c3_1.product.b.AbstractProductB;
import fun.pullock.gof.creational.c3_1.product.b.ProductB1;

public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
