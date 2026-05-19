package fun.pullock.gof.behavioral.c5_1;

public class Client {

    public static void main(String[] args) {

        // 创建处理者
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        // 构建责任链
        handlerA.setNext(handlerB);

        // 创建请求
        Request request = new Request("B Request");

        // 发送请求
        handlerA.handleRequest(request);
    }
}
