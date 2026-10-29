package fun.pullock.gof.structural.c4_2_Bridge.abstraction;

import fun.pullock.gof.structural.c4_2_Bridge.implemenation.Implementor;

public class RefinedAbstraction extends Abstraction {


    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("RefinedAbstraction 调用实现部分");
        implementor.operationImpl();
    }
}
