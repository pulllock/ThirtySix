package fun.pullock.utj.c2_3_1.object_header;

import org.openjdk.jol.info.ClassLayout;

public class ObjectHeaderInspector {

    public static void main(String[] args) {
        // 创建一个普通业务对象
        Order order = new Order();

        System.out.println("1. 刚new出来，未计算HashCode时的内存布局");
        System.out.println(ClassLayout.parseInstance(order).toPrintable());

        // 强行触发Identity HashCode计算
        int hashCode = order.hashCode();
        System.out.println(hashCode);
        System.out.println("Calculated Identity HashCode (Hex): " + Integer.toHexString(hashCode));

        hashCode = System.identityHashCode(order);
        System.out.println(hashCode);
        System.out.println("Calculated Identity HashCode (Hex): " + Integer.toHexString(hashCode));

        System.out.println("2. 计算HashCode之后，Mark Word被强行写入后的布局");
        System.out.println(ClassLayout.parseInstance(order).toPrintable());
    }
}
