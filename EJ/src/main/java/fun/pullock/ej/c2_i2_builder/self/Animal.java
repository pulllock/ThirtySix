package fun.pullock.ej.c2_i2_builder.self;

public abstract class Animal {

    private final String name;

    abstract static class Builder<T extends Builder<T>> {

        private String name;

        public T name(String name) {
            this.name = name;
            return self();
        }

        protected abstract T self();

        abstract Animal build();
    }

    Animal(Builder<?> builder) {
        this.name = builder.name;
    }
}
