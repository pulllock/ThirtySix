package fun.pullock.gof.behavioral.c5_7;

interface Subject {

    // 注册观察者
    void attach(Observer observer);

    // 移除观察者
    void detach(Observer observer);

    // 通知所有观察者
    void notifyObservers();
}
