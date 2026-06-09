package fun.pullock.gof.creational.c3_5_singleton.enum_type;

public class Client {

    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;

        // 判断是否为同一个对象
        System.out.println(s1 == s2);
    }
}
