package fun.pullock.gof.behavioral.c5_11;

public class ConcreteVisitorB implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("VisitorB访问ElementA");
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("VisitorB访问ElementB");
    }
}
