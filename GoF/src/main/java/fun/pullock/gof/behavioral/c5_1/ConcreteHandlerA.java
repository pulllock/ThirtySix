package fun.pullock.gof.behavioral.c5_1;

class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(Request request) {
        // 当前处理者是否能处理
        if (canHandle(request)) {
            System.out.println("ConcreteHandlerA 处理请求：" + request.getContent());

        } else {
            // 不能处理则传递给下一个处理者
            if (next != null) {
                next.handleRequest(request);
            } else {
                System.out.println("请求无人处理");
            }
        }
    }

    /**
     * 判断是否可以处理
     */
    private boolean canHandle(Request request) {
        return request.getContent().contains("A");
    }
}
