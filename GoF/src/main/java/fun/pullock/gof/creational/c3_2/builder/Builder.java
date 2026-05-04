package fun.pullock.gof.creational.c3_2.builder;

import fun.pullock.gof.creational.c3_2.product.Product;

public interface Builder {

    void buildPartA();
    void buildPartB();
    Product getResult();
}
