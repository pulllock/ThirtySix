package fun.pullock.gof.creational.c3_2.builder;

import fun.pullock.gof.creational.c3_2.product.Product;

public class ConcreteBuilder1 implements Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("A1");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B1");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
