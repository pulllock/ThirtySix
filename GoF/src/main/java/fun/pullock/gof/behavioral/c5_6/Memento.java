package fun.pullock.gof.behavioral.c5_6;

class Memento {

    /**
     * 保存的状态
     */
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    /**
     * 获取状态
     */
    public String getState() {
        return state;
    }
}
