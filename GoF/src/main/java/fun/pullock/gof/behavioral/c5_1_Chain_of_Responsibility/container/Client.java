package fun.pullock.gof.behavioral.c5_1_Chain_of_Responsibility.container;

public class Client {

    public static void main(String[] args) {
        // 创建处理者，构建责任链
        HandlerChain chain = new HandlerChain()
                .addHandler(new ConcreteHandlerA())
                .addHandler(new ConcreteHandlerB());

        // 创建请求
        Request request = new Request("B Request");

        // 发送请求
        chain.handleRequest(request);
    }
}
