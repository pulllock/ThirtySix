package fun.pullock.utj.c3_8_3_allocation;

public class TenuringThreshold {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        testTenuringThreshold();
    }

    /**
     * <p>使用命令行运行该测试代码，虚拟机参数：</p>
     * <p>Java 8: -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintGCCause -XX:+PrintTenuringDistribution</p>
     *
     * <p>Java 8默认的垃圾收集器是Parallel Scavenge + Parallel Old，如果想要用Serial收集器，
     * 可在命令行参数中添加：-XX:+UseSerialGC</p>
     *
     * <p>堆内存区域大小分配情况：</p>
     * <p>堆内存总大小为20MB，新生代内存10MB，老年代大小10MB。
     * 新生代中Eden大小8MB，Survivor 0大小为1MB，Survivor 1大小为1MB。</p>
     *
     */
    public static void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }
}
