package fun.pullock.gof.creational.c3_5_singleton.field;

public class Singleton {

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println("Singleton对象创建");
    }

    public void doSomething() {
        System.out.println("执行业务逻辑");
    }
}
