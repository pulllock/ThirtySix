package fun.pullock.gof.structural.c4_4.decorator;

import fun.pullock.gof.structural.c4_4.component.Component;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        before();

        super.operation();

        after();
    }

    private void before() {
        System.out.println("装饰器A：前置增强");
    }

    private void after() {
        System.out.println("装饰器A：后置增强");
    }
}
