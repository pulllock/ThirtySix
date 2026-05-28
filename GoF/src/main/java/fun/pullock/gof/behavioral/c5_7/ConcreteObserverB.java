package fun.pullock.gof.behavioral.c5_7;

class ConcreteObserverB implements Observer {

    @Override
    public void update(String message) {
        System.out.println("观察者B收到通知：" + message);
    }
}
