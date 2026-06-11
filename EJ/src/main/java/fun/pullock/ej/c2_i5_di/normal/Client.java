package fun.pullock.ej.c2_i5_di.normal;

public class Client {

    public static void main(String[] args) {
        ShapeFactory factory = new CircleFactory();
        Shape shape = factory.create();
    }
}
