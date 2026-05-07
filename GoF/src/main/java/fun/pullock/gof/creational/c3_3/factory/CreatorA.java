package fun.pullock.gof.creational.c3_3.factory;

import fun.pullock.gof.creational.c3_3.product.Product;
import fun.pullock.gof.creational.c3_3.product.ProductA;

public class CreatorA extends Creator {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
