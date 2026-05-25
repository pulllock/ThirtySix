package fun.pullock.gof.behavioral.c5_5;

class ConcreteMediator implements Mediator {

    private ConcreteColleagueA colleagueA;

    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void notify(Colleague colleague, String message) {
        System.out.println("中介者收到消息：" + message);

        /*
         * 如果是 A 发来的消息
         */
        if (colleague == colleagueA) {
            System.out.println("中介者协调 B 进行处理");
            colleagueB.receive();
        }

        /*
         * 如果是 B 发来的消息
         */
        if (colleague == colleagueB) {
            System.out.println("中介者协调 A 进行处理");
            colleagueA.receive();
        }
    }
}
