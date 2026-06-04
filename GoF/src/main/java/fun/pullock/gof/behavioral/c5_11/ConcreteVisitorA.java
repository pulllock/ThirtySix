package fun.pullock.gof.behavioral.c5_11;

public class ConcreteVisitorA implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("VisitorA访问ElementA");
    }

    @Override
    public void visit(ConcreteElementB element) {

        System.out.println("VisitorA访问ElementB");
    }
}
