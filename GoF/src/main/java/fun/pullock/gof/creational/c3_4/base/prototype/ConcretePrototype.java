package fun.pullock.gof.creational.c3_4.base.prototype;

public class ConcretePrototype implements Prototype {

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
