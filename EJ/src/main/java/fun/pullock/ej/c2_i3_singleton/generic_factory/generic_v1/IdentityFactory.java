package fun.pullock.ej.c2_i3_singleton.generic_factory.generic_v1;

public class IdentityFactory {

    public static <T> UnaryOperator<T> identityFunction() {
        return new UnaryOperator<T>() {
            @Override
            public T apply(T value) {
                return value;
            }
        };
    }
}
