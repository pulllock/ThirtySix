package fun.pullock.gof.structural.c4_3;

class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    void operation() {
        System.out.println("叶子节点: " + name);
    }
}
