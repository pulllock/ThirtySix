package fun.pullock.gof.structural.c4_2_Bridge.implemenation;

public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA 执行操作");
    }
}
