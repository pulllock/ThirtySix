package fun.pullock.gof.structural.c4_2;

import fun.pullock.gof.structural.c4_2.abstraction.Abstraction;
import fun.pullock.gof.structural.c4_2.abstraction.RefinedAbstraction;
import fun.pullock.gof.structural.c4_2.implemenation.ConcreteImplementorA;
import fun.pullock.gof.structural.c4_2.implemenation.ConcreteImplementorB;
import fun.pullock.gof.structural.c4_2.implemenation.Implementor;

public class Client {

    public static void main(String[] args) {
        // 使用实现A
        Implementor impA = new ConcreteImplementorA();
        Abstraction abstraction1 = new RefinedAbstraction(impA);
        abstraction1.operation();

        System.out.println();

        // 使用实现B
        Implementor impB = new ConcreteImplementorB();
        Abstraction abstraction2 = new RefinedAbstraction(impB);
        abstraction2.operation();
    }
}
