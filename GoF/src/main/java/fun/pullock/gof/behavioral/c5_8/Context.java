package fun.pullock.gof.behavioral.c5_8;

class Context {

    // 当前状态
    private State state;

    // 构造方法
    public Context(State state) {
        this.state = state;
    }

    // 切换状态
    public void setState(State state) {
        this.state = state;
    }

    // 对外行为接口
    public void request() {
        // 委托给当前状态
        state.handle(this);
    }
}
