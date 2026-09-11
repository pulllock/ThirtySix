package fun.pullock.utj.c6_5_jit;

/**
 * 模拟JIT（即时编译器）将字节码动态编译为本地机器码的触发过程
 * 逃逸分析与标量替换（消除了对象在堆上的真实分配）
 */
public class JitCompilation {

    public static class UserPoint {
        private final int x;
        private final int y;

        public UserPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getSum() {
            return x + y;
        }
    }

    /**
     * 该方法将被反复调用，触发JIT热点编译
     */
    public static int compute() {
        // UserPoint未逃逸出compute方法
        // JIT编译后，不会真的在JVM堆中new对象，而是拆解为两个本地变量 (标量替换)
        // 最终机器码会直接使用CPU寄存器做加法
        UserPoint point = new UserPoint(10, 20);
        return point.getSum();
    }

    /**
     * 启动参数： -XX:+PrintCompilation -XX:+UnlockDiagnosticVMOptions -XX:+PrintInlining
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== 开始运行程序，初始阶段为解释执行 ===");
        long start = System.currentTimeMillis();

        // 循环多次以达到HotSpot虚拟机的JIT编译阈值 (默认C2阈值为10000次左右)
        int result = 0;
        for (int i = 0; i < 100_0000; i++) {
            result += compute();
            if (i == 1_0000) {
                System.out.println("-> 已达到热点阈值，JIT编译器已在后台将compute()编译为CPU本地机器码！");
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("计算完成，最终结果: " + result);
        System.out.println("百万次执行总耗时: " + (end - start) + " ms");
    }
}
