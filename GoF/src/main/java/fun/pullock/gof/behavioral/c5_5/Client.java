package fun.pullock.gof.behavioral.c5_5;

public class Client {

    public static void main(String[] args) {

        /*
         * 创建中介者
         */
        ConcreteMediator mediator = new ConcreteMediator();

        /*
         * 创建同事对象
         */
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);

        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        /*
         * 注册到中介者
         */
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        /*
         * A 发起操作
         */
        colleagueA.operationA();

        System.out.println();

        /*
         * B 发起操作
         */
        colleagueB.operationB();
    }
}
