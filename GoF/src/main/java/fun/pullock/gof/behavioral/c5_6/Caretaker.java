package fun.pullock.gof.behavioral.c5_6;

class Caretaker {

    /**
     * 备忘录
     */
    private Memento memento;

    /**
     * 保存备忘录
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    /**
     * 获取备忘录
     */
    public Memento getMemento() {
        return memento;
    }
}
