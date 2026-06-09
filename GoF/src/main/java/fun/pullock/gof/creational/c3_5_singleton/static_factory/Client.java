package fun.pullock.gof.creational.c3_5_singleton.static_factory;

public class Client {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.doSomething();

        // 判断是否为同一个对象
        System.out.println(s1 == s2);
    }
}
