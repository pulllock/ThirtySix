package fun.pullock.gof.behavioral.c5_7;

import java.util.ArrayList;
import java.util.List;

class ConcreteSubject implements Subject {

    // 保存所有观察者
    private List<Observer> observers = new ArrayList<>();

    // 内部状态
    private String state;

    // 注册观察者
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 通知所有观察者
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    // 修改状态
    public void setState(String state) {
        System.out.println("主题状态改变：" + state);
        this.state = state;
        // 状态变化后自动通知
        notifyObservers();
    }

    public String getState() {
        return state;
    }
}