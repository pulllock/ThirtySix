package fun.pullock.gof.behavioral.c5_7;

class ConcreteObserverA implements Observer {

    @Override
    public void update(String message) {
        System.out.println("观察者A收到通知：" + message);
    }
}
