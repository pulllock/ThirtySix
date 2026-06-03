package fun.pullock.gof.behavioral.c5_10;

public class Client {

    public static void main(String[] args) {

        AbstractClass template = new ConcreteClassA();

        template.templateMethod();
    }
}
