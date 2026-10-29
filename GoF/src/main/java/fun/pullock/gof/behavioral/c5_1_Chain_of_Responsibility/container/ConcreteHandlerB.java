package fun.pullock.gof.behavioral.c5_1_Chain_of_Responsibility.container;

class ConcreteHandlerB extends Handler {

    @Override
    public void handleRequest(Request request, HandlerChain chain) {
        // 当前处理者是否能处理
        if (canHandle(request)) {
            System.out.println("ConcreteHandlerB 处理请求：" + request.getContent());

        }

        // 请求交给下一个处理器
        chain.handleRequest(request);
    }

    /**
     * 判断是否可以处理
     */
    private boolean canHandle(Request request) {
        return request.getContent().contains("B");
    }
}
