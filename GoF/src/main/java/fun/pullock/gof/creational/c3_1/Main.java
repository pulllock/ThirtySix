package fun.pullock.gof.creational.c3_1;

import fun.pullock.gof.creational.c3_1.factory.AbstractFactory;
import fun.pullock.gof.creational.c3_1.factory.ConcreteFactory1;
import fun.pullock.gof.creational.c3_1.factory.ConcreteFactory2;

public class Main {

    public static void main(String[] args) {
        // 选择产品族（运行时决定）
        AbstractFactory factory = new ConcreteFactory1();
        // AbstractFactory factory = new ConcreteFactory2();

        Client client = new Client(factory);
        client.run();
    }
}
