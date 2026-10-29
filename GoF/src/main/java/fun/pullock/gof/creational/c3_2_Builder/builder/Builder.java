package fun.pullock.gof.creational.c3_2_Builder.builder;

import fun.pullock.gof.creational.c3_2_Builder.product.Product;

public interface Builder {

    void buildPartA();
    void buildPartB();
    Product getResult();
}
