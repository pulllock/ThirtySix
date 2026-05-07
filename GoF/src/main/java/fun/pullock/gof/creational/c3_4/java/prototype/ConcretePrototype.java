package fun.pullock.gof.creational.c3_4.java.prototype;

public class ConcretePrototype implements Cloneable {

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
