package fun.pullock.ej.c2_i2_builder.self;

public class Dog extends Animal {

    private final String breed;

    public static class Builder extends Animal.Builder<Builder> {

        private String breed;

        public Builder breed(String breed) {
            this.breed = breed;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        Dog build() {
            return new Dog(this);
        }
    }

    private Dog(Builder builder) {
        super(builder);
        this.breed = builder.breed;
    }
}
