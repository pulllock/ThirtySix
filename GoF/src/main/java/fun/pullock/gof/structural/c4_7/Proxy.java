package fun.pullock.gof.structural.c4_7;

public class Proxy implements Subject {

    /**
     * 持有真实对象引用
     */
    private RealSubject realSubject;

    @Override
    public void request() {

        // 前置控制
        preRequest();

        // 延迟创建真实对象
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        // 调用真实对象
        realSubject.request();

        // 后置控制
        postRequest();
    }

    private void preRequest() {
        System.out.println(
                "Proxy: 前置处理"
        );
    }

    private void postRequest() {
        System.out.println(
                "Proxy: 后置处理"
        );
    }
}
