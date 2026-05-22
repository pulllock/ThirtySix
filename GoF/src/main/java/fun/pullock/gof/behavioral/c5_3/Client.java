package fun.pullock.gof.behavioral.c5_3;

public class Client {

    public static void main(String[] args) {

        Context context = new Context();

        context.assign("a", 10);
        context.assign("b", 20);
        context.assign("c", 5);

        /*
              a + b - c

                  -
                /   \
               +     c
             /   \
            a     b
         */

        Expression expression =
                new SubtractExpression(
                        new AddExpression(
                                new VariableExpression("a"),
                                new VariableExpression("b")
                        ),
                        new VariableExpression("c")
                );

        int result = expression.interpret(context);

        System.out.println(result);
    }
}
