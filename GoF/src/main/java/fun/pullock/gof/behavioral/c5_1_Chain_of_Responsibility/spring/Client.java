package fun.pullock.gof.behavioral.c5_1_Chain_of_Responsibility.spring;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        // 模拟Spring 注入所有的处理器
        List<Handler> handlers = new ArrayList<>();
        handlers.add(new ConcreteHandlerA());
        handlers.add(new ConcreteHandlerB());
        HandlerChain chain = new HandlerChain(handlers);

        // 创建请求
        Request request = new Request("B Request");

        // 执行请求
        chain.handleRequest(request);
    }
}
