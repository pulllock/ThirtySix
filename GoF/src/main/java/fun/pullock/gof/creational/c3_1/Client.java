package fun.pullock.gof.creational.c3_1;

import fun.pullock.gof.creational.c3_1.factory.AbstractFactory;
import fun.pullock.gof.creational.c3_1.product.a.AbstractProductA;
import fun.pullock.gof.creational.c3_1.product.b.AbstractProductB;

public class Client {

    private final AbstractProductA productA;
    private final AbstractProductB productB;

    public Client(AbstractFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public void run() {
        productA.useProductA();
        productB.useProductB();
    }
}
