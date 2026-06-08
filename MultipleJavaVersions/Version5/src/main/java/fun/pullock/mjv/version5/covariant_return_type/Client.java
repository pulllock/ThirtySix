package fun.pullock.mjv.version5.covariant_return_type;

public class Client {

    public static void main(String[] args) {
        Dog dog = new Dog();

        // 返回类型是Dog
        Dog copy = dog.copy();

        // 可以直接调用Dog独有的方法
        copy.bark();
    }
}
