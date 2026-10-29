package fun.pullock.gof.behavioral.c5_1_Chain_of_Responsibility.spring;

import java.util.List;

/**
 * Spring Bean
 */
public class HandlerChain {

    // Spring自动注入所有的处理器
    private List<Handler> handlers;

    public HandlerChain(List<Handler> handlers) {
        this.handlers = handlers;
    }

    public void handleRequest(Request request) {
        for (Handler handler : handlers) {
            handler.handleRequest(request);
        }
    }
}
