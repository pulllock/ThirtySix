package fun.pullock.gof.behavioral.c5_7;

interface Observer {

    // 收到通知后执行更新
    void update(String message);
}
