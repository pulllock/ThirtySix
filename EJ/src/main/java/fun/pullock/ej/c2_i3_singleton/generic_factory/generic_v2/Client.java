package fun.pullock.ej.c2_i3_singleton.generic_factory.generic_v2;

public class Client {

    public static void main(String[] args) {

        UnaryOperator<String> op1 = IdentityFactory.identityFunction();

        UnaryOperator<Integer> op2 = IdentityFactory.identityFunction();

        System.out.println(op1.apply("Hello"));

        System.out.println(op2.apply(100));

        UnaryOperator<String> op3 = IdentityFactory.identityFunction();
        System.out.println(op3.apply("Hello"));
        System.out.println(op1 == op3);
    }
}
