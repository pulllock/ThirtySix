package fun.pullock.utj.c3_8_2_allocation;

public class PretenureSizeThreshold {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }

    /**
     * <p>使用命令行运行该测试代码，虚拟机参数：</p>
     * <p>Java 8: -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728 -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintGCCause</p>
     *
     * <p>Java 8默认的垃圾收集器是Parallel Scavenge + Parallel Old，如果想要用Serial收集器，
     * 可在命令行参数中添加：-XX:+UseSerialGC</p>
     *
     * <p>堆内存区域大小分配情况：</p>
     * <p>堆内存总大小为20MB，新生代内存10MB，老年代大小10MB。
     * 新生代中Eden大小8MB，Survivor 0大小为1MB，Survivor 1大小为1MB。</p>
     *
     * <p>代码：</p>
     * <p>分配一个4MB大小的数组对象，由于设置了超过3MB大小的对象直接在分配到老年代，
     * 故这个对象直接分配到老年中。</p>
     */
    public static void testPretenureSizeThreshold() {
        byte[] allocation;

        // 直接分配在老年代中
        allocation = new byte[4 * _1MB];
    }
}
