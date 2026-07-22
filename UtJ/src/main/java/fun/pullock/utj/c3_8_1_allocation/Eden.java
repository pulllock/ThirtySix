package fun.pullock.utj.c3_8_1_allocation;

public class Eden {

    /**
     * 定义1MB大小
     */
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        testAllocation();
    }

    /**
     * <p>使用命令行运行该测试代码，虚拟机参数：</p>
     * <p>Java 8: -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintGCCause</p>
     * <p>Java 9: -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -Xlog:gc*:stdout:time,uptime,level,tags</p>
     *
     * <p>Java 8默认的垃圾收集器是Parallel Scavenge + Parallel Old，如果想要用Serial收集器，
     * 可在命令行参数中添加：-XX:+UseSerialGC</p>
     *
     * <p>堆内存区域大小分配情况：</p>
     * <p>堆内存总大小为20MB，新生代内存10MB，老年代大小10MB。
     * 新生代中Eden大小8MB，Survivor 0大小为1MB，Survivor 1大小为1MB。</p>
     *
     * <p>代码：</p>
     * <p>先在新生代中分配3个2MB大小的数组对象，总共占了新生代中Eden的6MB空间，此时Eden剩余2MB可用空间，
     * 最后再分配一个4MB大小的数组对象，由于Eden中可用空间不足，会产生一次Minor GC。</p>
     */
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        // 出现一次Minor GC
        allocation4 = new byte[4 * _1MB];
    }

}
