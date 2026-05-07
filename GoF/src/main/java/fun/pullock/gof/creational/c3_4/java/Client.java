package fun.pullock.gof.creational.c3_4.java;


import fun.pullock.gof.creational.c3_4.java.prototype.ConcretePrototype;

public class Client {

    public static void main(String[] args) {

        ConcretePrototype p1 = new ConcretePrototype("Jack");

        ConcretePrototype p2 = p1.clone();

        p1.show();
        p2.show();

        System.out.println(p1 == p2);
    }
}
