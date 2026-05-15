package fun.pullock.gof.structural.c4_6;

public class ConcreteFlyweight implements Flyweight {

    /**
     * 内部状态（Intrinsic State）
     * 可共享
     */
    private final String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("内部状态: " + intrinsicState);

        System.out.println("外部状态: " + extrinsicState);
    }
}
