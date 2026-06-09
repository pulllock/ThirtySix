package fun.pullock.ej.c2_i3_singleton.generic_factory.generic_v2;

public class IdentityFactory {

    private static final UnaryOperator<Object> IDENTITY_FUNCTION = value -> value;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FUNCTION;
    }
}
