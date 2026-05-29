package fun.pullock.gof.behavioral.c5_8;

class ConcreteStateB implements State {

    @Override
    public void handle(Context context) {
        System.out.println("当前状态：StateB");

        // 状态切换
        System.out.println("StateB -> StateA");

        context.setState(new ConcreteStateA());
    }
}