package fun.pullock.gof.behavioral.c5_2;

public class Client {

    public static void main(String[] args) {

        /*
         * 创建接收者
         */
        Receiver receiver = new Receiver();

        /*
         * 创建命令对象
         */
        Command command = new ConcreteCommand(receiver);

        /*
         * 创建调用者
         */
        Invoker invoker = new Invoker();

        /*
         * 设置命令
         */
        invoker.setCommand(command);

        /*
         * 执行命令
         */
        invoker.invoke();
    }
}