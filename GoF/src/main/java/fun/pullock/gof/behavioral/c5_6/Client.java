package fun.pullock.gof.behavioral.c5_6;

public class Client {

    public static void main(String[] args) {

        /*
         * 创建原发器
         */
        Originator originator = new Originator();

        /*
         * 创建管理者
         */
        Caretaker caretaker = new Caretaker();

        /*
         * 设置状态
         */
        originator.setState("State-A");

        originator.showState();

        /*
         * 保存状态
         */
        caretaker.setMemento(
                originator.createMemento()
        );

        System.out.println();

        /*
         * 修改状态
         */
        originator.setState("State-B");

        originator.showState();

        System.out.println();

        /*
         * 恢复状态
         */
        originator.restoreMemento(
                caretaker.getMemento()
        );

        originator.showState();
    }
}