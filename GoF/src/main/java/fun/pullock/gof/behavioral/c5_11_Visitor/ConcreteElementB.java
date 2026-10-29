package fun.pullock.gof.behavioral.c5_11_Visitor;

public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationB() {
        System.out.println("ElementB自身逻辑");
    }
}
