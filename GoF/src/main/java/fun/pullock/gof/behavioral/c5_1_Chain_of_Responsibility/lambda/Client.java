package fun.pullock.gof.behavioral.c5_1_Chain_of_Responsibility.lambda;

import java.util.function.Consumer;

public class Client {

    public static void main(String[] args) {
        // 定义轻量级的不同处理器
        Consumer<String> handlerA = s -> {
            if (s.contains("A")) {
                System.out.println("ConcreteHandlerA 处理请求：" + s);
            }
        };
        Consumer<String> handlerB = s -> {
            if (s.contains("B")) {
                System.out.println("ConcreteHandlerB 处理请求：" + s);
            }
        };

        // 组装责任链
        Consumer<String> pipeline = handlerA.andThen(handlerB);

        // 执行
        pipeline.accept("B Request");
    }
}
