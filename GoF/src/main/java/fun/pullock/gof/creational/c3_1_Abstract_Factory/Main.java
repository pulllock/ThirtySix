package fun.pullock.gof.creational.c3_1_Abstract_Factory;

import fun.pullock.gof.creational.c3_1_Abstract_Factory.factory.AbstractFactory;
import fun.pullock.gof.creational.c3_1_Abstract_Factory.factory.ConcreteFactory1;

public class Main {

    public static void main(String[] args) {
        // 选择产品族（运行时决定）
        AbstractFactory factory = new ConcreteFactory1();
        // AbstractFactory factory = new ConcreteFactory2();

        Client client = new Client(factory);
        client.run();
    }
}
