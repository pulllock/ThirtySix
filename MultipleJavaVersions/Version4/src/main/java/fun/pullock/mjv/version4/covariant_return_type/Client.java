package fun.pullock.mjv.version4.covariant_return_type;

public class Client {

    public static void main(String[] args) {
        Dog dog = new Dog();

        // 返回的类型是Animal
        Animal copy = dog.copy();

        // 调用Dog独有的方法需要强制类型转换
        ((Dog) copy).bark();
    }
}
