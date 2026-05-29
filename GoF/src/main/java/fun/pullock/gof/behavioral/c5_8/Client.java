package fun.pullock.gof.behavioral.c5_8;

public class Client {

    public static void main(String[] args) {
        // 初始状态
        State initState = new ConcreteStateA();

        // 创建上下文
        Context context = new Context(initState);

        // 第一次请求
        context.request();

        System.out.println();

        // 第二次请求
        context.request();

        System.out.println();

        // 第三次请求
        context.request();
    }
}
