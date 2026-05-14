package fun.pullock.gof.structural.c4_3;

abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    // 公共操作
    abstract void operation();

    // 管理子节点的方法
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
