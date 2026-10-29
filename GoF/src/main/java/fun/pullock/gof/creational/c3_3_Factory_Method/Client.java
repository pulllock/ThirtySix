package fun.pullock.gof.creational.c3_3_Factory_Method;

import fun.pullock.gof.creational.c3_3_Factory_Method.factory.Creator;
import fun.pullock.gof.creational.c3_3_Factory_Method.factory.CreatorA;
import fun.pullock.gof.creational.c3_3_Factory_Method.factory.CreatorB;

public class Client {

    public static void main(String[] args) {
        Creator creator;

        creator = new CreatorA();
        creator.operation();

        creator = new CreatorB();
        creator.operation();
    }
}
