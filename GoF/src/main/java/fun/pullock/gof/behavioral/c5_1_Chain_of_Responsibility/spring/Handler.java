package fun.pullock.gof.behavioral.c5_1_Chain_of_Responsibility.spring;


abstract class Handler {

    /**
     * 处理请求
     */
    public abstract void handleRequest(Request request);
}
