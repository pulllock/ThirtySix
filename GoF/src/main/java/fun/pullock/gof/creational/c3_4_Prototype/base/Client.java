package fun.pullock.gof.creational.c3_4_Prototype.base;

import fun.pullock.gof.creational.c3_4_Prototype.base.prototype.ConcretePrototype;

public class Client {

    public static void main(String[] args) {

        ConcretePrototype p1 = new ConcretePrototype("Tom");

        ConcretePrototype p2 = (ConcretePrototype) p1.clone();

        p1.show();
        p2.show();

        System.out.println(p1 == p2);
    }
}
