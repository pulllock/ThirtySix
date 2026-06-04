package fun.pullock.gof.behavioral.c5_11;

public class Client {

    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();

        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());

        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();

        structure.accept(visitorA);

        System.out.println("--------------");

        structure.accept(visitorB);
    }
}