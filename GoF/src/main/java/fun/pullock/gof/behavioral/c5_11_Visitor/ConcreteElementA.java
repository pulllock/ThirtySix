package fun.pullock.gof.behavioral.c5_11_Visitor;

public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationA() {
        System.out.println("ElementA自身逻辑");
    }
}
