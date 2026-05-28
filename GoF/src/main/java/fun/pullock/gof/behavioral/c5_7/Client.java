package fun.pullock.gof.behavioral.c5_7;

public class Client {

    public static void main(String[] args) {

        // 创建主题
        ConcreteSubject subject = new ConcreteSubject();

        // 创建观察者
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        // 注册观察者
        subject.attach(observerA);
        subject.attach(observerB);

        // 修改状态
        subject.setState("状态1");
        System.out.println("----------");
        subject.setState("状态2");
    }
}
