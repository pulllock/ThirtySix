package fun.pullock.ej.c2_i3_singleton.generic_factory.specialized;

public class IntegerIdentityFactory {

    private static final UnaryOperator<Integer> IDENTITY_FUNCTION = value -> value;

    public static UnaryOperator<Integer> identityFunction() {
        return IDENTITY_FUNCTION;
    }
}
