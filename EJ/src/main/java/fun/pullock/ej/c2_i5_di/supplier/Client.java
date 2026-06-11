package fun.pullock.ej.c2_i5_di.supplier;

import java.util.function.Supplier;

public class Client {

    public static void main(String[] args) {
        Supplier<Shape> factory = Circle::new;
        Shape shape = factory.get();
    }
}
