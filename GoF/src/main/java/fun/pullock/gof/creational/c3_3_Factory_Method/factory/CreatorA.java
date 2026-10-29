package fun.pullock.gof.creational.c3_3_Factory_Method.factory;

import fun.pullock.gof.creational.c3_3_Factory_Method.product.Product;
import fun.pullock.gof.creational.c3_3_Factory_Method.product.ProductA;

public class CreatorA extends Creator {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
