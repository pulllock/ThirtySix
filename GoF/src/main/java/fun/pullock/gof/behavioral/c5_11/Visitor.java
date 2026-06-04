package fun.pullock.gof.behavioral.c5_11;

public interface Visitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}