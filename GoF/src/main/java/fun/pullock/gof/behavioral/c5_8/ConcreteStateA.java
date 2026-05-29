package fun.pullock.gof.behavioral.c5_8;

class ConcreteStateA implements State {

    @Override
    public void handle(Context context) {
        System.out.println("当前状态：StateA");

        // 状态切换
        System.out.println("StateA -> StateB");

        context.setState(new ConcreteStateB());
    }
}
