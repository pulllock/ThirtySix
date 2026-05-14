package fun.pullock.gof.structural.c4_3;

public class Client {

    public static void main(String[] args) {
        // 根节点
        Composite root = new Composite("根目录");

        // 叶子节点
        Leaf file1 = new Leaf("文件A");
        Leaf file2 = new Leaf("文件B");

        // 子目录
        Composite folder = new Composite("子目录");

        // 子目录下的文件
        Leaf file3 = new Leaf("文件C");

        // 组装树结构
        folder.add(file3);

        root.add(file1);
        root.add(file2);
        root.add(folder);

        // 统一调用
        root.operation();
    }
}
