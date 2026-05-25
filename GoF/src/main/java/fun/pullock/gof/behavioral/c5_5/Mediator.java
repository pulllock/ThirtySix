package fun.pullock.gof.behavioral.c5_5;

interface Mediator {

    /**
     * 接收同事对象消息
     *
     * @param colleague 发送消息的对象
     * @param message   消息内容
     */
    void notify(Colleague colleague, String message);
}