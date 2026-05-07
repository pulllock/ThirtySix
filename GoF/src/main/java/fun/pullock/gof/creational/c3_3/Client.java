package fun.pullock.gof.creational.c3_3;

import fun.pullock.gof.creational.c3_3.factory.Creator;
import fun.pullock.gof.creational.c3_3.factory.CreatorA;
import fun.pullock.gof.creational.c3_3.factory.CreatorB;

public class Client {

    public static void main(String[] args) {
        Creator creator;

        creator = new CreatorA();
        creator.operation();

        creator = new CreatorB();
        creator.operation();
    }
}
