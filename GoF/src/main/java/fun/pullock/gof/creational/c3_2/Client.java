package fun.pullock.gof.creational.c3_2;

import fun.pullock.gof.creational.c3_2.builder.Builder;
import fun.pullock.gof.creational.c3_2.builder.ConcreteBuilder1;
import fun.pullock.gof.creational.c3_2.builder.ConcreteBuilder2;
import fun.pullock.gof.creational.c3_2.product.Product;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        // 使用具体建造者1
        Builder builder1 = new ConcreteBuilder1();
        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        // 使用具体建造者2
        Builder builder2 = new ConcreteBuilder2();
        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}
