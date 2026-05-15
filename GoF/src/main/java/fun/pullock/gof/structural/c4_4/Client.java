package fun.pullock.gof.structural.c4_4;

import fun.pullock.gof.structural.c4_4.component.Component;
import fun.pullock.gof.structural.c4_4.component.ConcreteComponent;
import fun.pullock.gof.structural.c4_4.decorator.ConcreteDecoratorA;
import fun.pullock.gof.structural.c4_4.decorator.ConcreteDecoratorB;

public class Client {

    public static void main(String[] args) {

        // 原始对象
        Component component = new ConcreteComponent();

        System.out.println("------ 原始对象 ------");

        component.operation();

        System.out.println();


        // 使用装饰器A
        Component decoratorA = new ConcreteDecoratorA(component);

        System.out.println("------ 装饰器A ------");

        decoratorA.operation();

        System.out.println();


        // 嵌套多个装饰器
        Component decoratorB =
                new ConcreteDecoratorB(
                        new ConcreteDecoratorA(
                                component
                        )
                );

        System.out.println("------ A + B组合 ------");

        decoratorB.operation();
    }
}