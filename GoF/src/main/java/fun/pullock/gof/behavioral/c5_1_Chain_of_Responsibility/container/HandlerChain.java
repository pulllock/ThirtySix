package fun.pullock.gof.behavioral.c5_1_Chain_of_Responsibility.container;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

    // 使用容器来组织处理器链
    private List<Handler> handlers = new ArrayList<>();

    // 当前执行到的处理器索引
    private int index = 0;

    public HandlerChain addHandler(Handler handler){
        handlers.add(handler);
        return this;
    }

    public void handleRequest(Request request) {
        // 已经执行完了所有的处理器
        if (index >= handlers.size()) {
            return;
        }

        // 获取当前需要执行的处理器，并将索引自增
        Handler currentHandler = handlers.get(index++);

        // 执行当前处理器
        currentHandler.handleRequest(request, this);
    }
}
