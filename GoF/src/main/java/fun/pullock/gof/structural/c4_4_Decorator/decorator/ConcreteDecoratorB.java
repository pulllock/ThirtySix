package fun.pullock.gof.structural.c4_4_Decorator.decorator;

import fun.pullock.gof.structural.c4_4_Decorator.component.Component;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        extraFunction();

        super.operation();
    }

    private void extraFunction() {
        System.out.println("装饰器B：额外功能");
    }
}
