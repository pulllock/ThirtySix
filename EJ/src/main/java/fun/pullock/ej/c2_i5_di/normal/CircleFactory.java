package fun.pullock.ej.c2_i5_di.normal;

public class CircleFactory implements ShapeFactory {

    @Override
    public Circle create() {
        return new Circle();
    }
}
