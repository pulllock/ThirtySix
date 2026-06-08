package fun.pullock.ej.c2_i2_builder.normal;

public class Dog extends Animal {

    private final String breed;

    public static class Builder extends Animal.Builder {

        private String breed;

        public Builder breed(String breed) {
            this.breed = breed;
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
