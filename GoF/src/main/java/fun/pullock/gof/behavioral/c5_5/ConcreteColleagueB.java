package fun.pullock.gof.behavioral.c5_5;

class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void operationB() {
        System.out.println("ColleagueB 执行业务操作");

        mediator.notify(this, "B_CHANGED");
    }

    public void receive() {
        System.out.println("ColleagueB 收到通知");
    }
}