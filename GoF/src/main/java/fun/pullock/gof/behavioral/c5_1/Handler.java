package fun.pullock.gof.behavioral.c5_1;

abstract class Handler {

    /**
     * 下一个处理者
     */
    protected Handler next;

    /**
     * 设置下一个处理者
     */
    public void setNext(Handler next) {
        this.next = next;
    }

    /**
     * 处理请求
     */
    public abstract void handleRequest(Request request);
}
