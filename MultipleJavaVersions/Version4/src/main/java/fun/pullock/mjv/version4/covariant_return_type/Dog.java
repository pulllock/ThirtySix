package fun.pullock.mjv.version4.covariant_return_type;


class Dog extends Animal {

    // 不能返回子类型Dog
    // Dog copy() {
    //     return new Dog();
    // }

    // 只能返回父类型Animal
    Animal copy() {
        return new Dog();
    }

    void bark() {

    }
}