package fun.pullock.gof.structural.c4_4_Decorator.component;

public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("执行核心功能");
    }
}
