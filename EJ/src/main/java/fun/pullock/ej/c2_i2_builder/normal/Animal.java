package fun.pullock.ej.c2_i2_builder.normal;

public abstract class Animal {

    private final String name;

    abstract static class Builder {

        private String name;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        abstract Animal build();
    }

    Animal(Builder builder) {
        this.name = builder.name;
    }
}
