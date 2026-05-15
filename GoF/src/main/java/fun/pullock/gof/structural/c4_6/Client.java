package fun.pullock.gof.structural.c4_6;

public class Client {

    public static void main(String[] args) {

        Flyweight flyweight1 = FlyweightFactory.getFlyweight("A");

        Flyweight flyweight2 = FlyweightFactory.getFlyweight("A");

        System.out.println(flyweight1 == flyweight2);

        flyweight1.operation("External State 1");

        flyweight2.operation("External State 2");
    }
}
