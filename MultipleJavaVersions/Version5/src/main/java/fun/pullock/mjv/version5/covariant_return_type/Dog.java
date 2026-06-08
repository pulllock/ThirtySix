package fun.pullock.mjv.version5.covariant_return_type;

class Dog extends Animal {

    // 可以返回子类型Dog
    @Override
    Dog copy() {
        return new Dog();
    }

    void bark() {

    }
}