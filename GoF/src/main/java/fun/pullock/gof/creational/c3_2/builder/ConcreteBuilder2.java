package fun.pullock.gof.creational.c3_2.builder;

import fun.pullock.gof.creational.c3_2.product.Product;

public class ConcreteBuilder2 implements Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("A2");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
