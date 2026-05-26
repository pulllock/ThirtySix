package fun.pullock.gof.behavioral.c5_6;

class Originator {

    /**
     * 当前状态
     */
    private String state;

    /**
     * 设置状态
     */
    public void setState(String state) {
        System.out.println("设置状态：" + state);
        this.state = state;
    }

    /**
     * 显示当前状态
     */
    public void showState() {
        System.out.println("当前状态：" + state);
    }

    /**
     * 创建备忘录
     */
    public Memento createMemento() {
        System.out.println("保存当前状态");
        return new Memento(state);
    }

    /**
     * 从备忘录恢复状态
     */
    public void restoreMemento(Memento memento) {
        System.out.println("恢复状态");
        this.state = memento.getState();
    }
}
