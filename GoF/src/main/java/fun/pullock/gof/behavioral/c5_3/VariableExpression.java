package fun.pullock.gof.behavioral.c5_3;

public class VariableExpression implements Expression {

    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(name);
    }
}