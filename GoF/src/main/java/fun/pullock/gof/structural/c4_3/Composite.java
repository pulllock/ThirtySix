package fun.pullock.gof.structural.c4_3;

import java.util.ArrayList;
import java.util.List;

class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    void operation() {
        System.out.println("组合节点: " + name);

        // 递归调用子节点
        for (Component child : children) {
            child.operation();
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }
}