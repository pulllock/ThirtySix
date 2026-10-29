package fun.pullock.gof.creational.c3_2_Builder;

import fun.pullock.gof.creational.c3_2_Builder.builder.Builder;

public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
