package fun.pullock.gof.behavioral.c5_5;

class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    /**
     * 自己的业务方法
     */
    public void operationA() {
        System.out.println("ColleagueA 执行业务操作");

        // 通知中介者
        mediator.notify(this, "A_CHANGED");
    }

    /**
     * 被中介者调用的方法
     */
    public void receive() {
        System.out.println("ColleagueA 收到通知");
    }
}
