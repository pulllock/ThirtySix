package fun.pullock.gof.structural.c4_4.decorator;

import fun.pullock.gof.structural.c4_4.component.Component;

public abstract class Decorator implements Component {

    // 被装饰对象
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }


    @Override
    public void operation() {
        // 转发请求
        component.operation();
    }
}
