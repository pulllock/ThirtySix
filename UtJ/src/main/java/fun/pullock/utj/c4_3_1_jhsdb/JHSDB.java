package fun.pullock.utj.c4_3_1_jhsdb;

public class JHSDB {

    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            ObjectHolder localObj = new ObjectHolder();

            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static class ObjectHolder {
    }

    /**
     * <p>使用命令行运行该测试代码，虚拟机参数：</p>
     * <p>Java 8: -Xms10M -Xmx10M -XX:+UseSerialGC</p>
     *
     */
    public static void main(String[] args) {
        Test test = new Test();
        test.foo();
    }
}
