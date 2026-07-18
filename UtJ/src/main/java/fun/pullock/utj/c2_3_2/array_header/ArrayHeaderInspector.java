package fun.pullock.utj.c2_3_2.array_header;

import org.openjdk.jol.info.ClassLayout;

public class ArrayHeaderInspector {

    public static void main(String[] args) {
        // 1. 普通对象
        NormalObject normal = new NormalObject();
        // 2. 数组对象（含有5个元素的int数组）
        int[] array = new int[5];

        System.out.println("A. 普通对象的内存布局");
        System.out.println(ClassLayout.parseInstance(normal).toPrintable());

        System.out.println("B. 数组对象的内存布局");
        System.out.println(ClassLayout.parseInstance(array).toPrintable());
    }
}
