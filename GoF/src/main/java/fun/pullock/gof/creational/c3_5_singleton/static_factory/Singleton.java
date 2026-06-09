package fun.pullock.gof.creational.c3_5_singleton.static_factory;

/**
 * 饿汉式单例
 */
public class Singleton {

    // 1. 保存唯一实例
    // 饿汉式（Eager Initialization），类加载时立刻创建对象。
    // 优点：简单，线程安全
    // 缺点：即使不使用也会创建
    private static final Singleton INSTANCE = new Singleton();

    // 2. 私有化构造方法
    private Singleton() {
        System.out.println("Singleton对象创建");
    }

    // 3. 提供全局访问点
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // 4. 普通业务方法
    public void doSomething() {
        System.out.println("执行业务逻辑");
    }
}
