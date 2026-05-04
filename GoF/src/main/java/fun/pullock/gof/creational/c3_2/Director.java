package fun.pullock.gof.creational.c3_2;

import fun.pullock.gof.creational.c3_2.builder.Builder;

public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
