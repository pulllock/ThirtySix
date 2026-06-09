package fun.pullock.ej.c2_i3_singleton.generic_factory.specialized;

public class StringIdentityFactory {

    private static final UnaryOperator<String> IDENTITY_FUNCTION = value -> value;

    public static UnaryOperator<String> identityFunction() {
        return IDENTITY_FUNCTION;
    }
}
