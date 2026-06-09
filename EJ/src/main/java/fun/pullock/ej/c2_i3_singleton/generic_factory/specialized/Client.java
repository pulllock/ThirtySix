package fun.pullock.ej.c2_i3_singleton.generic_factory.specialized;

public class Client {

    public static void main(String[] args) {
        UnaryOperator<String> stringOperator = StringIdentityFactory.identityFunction();

        UnaryOperator<Integer> integerOperator = IntegerIdentityFactory.identityFunction();

        System.out.println(stringOperator.apply("Hello"));

        System.out.println(integerOperator.apply(100));


    }
}
