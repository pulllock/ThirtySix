package fun.pullock.gof.behavioral.c5_10;

public abstract class AbstractClass {

    /**
     * Template Method
     * 定义算法骨架
     */
    public final void templateMethod() {

        primitiveOperation1();

        primitiveOperation2();
    }

    /**
     * Primitive Operation
     */
    protected abstract void primitiveOperation1();

    /**
     * Primitive Operation
     */
    protected abstract void primitiveOperation2();
}
