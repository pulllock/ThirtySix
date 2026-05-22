package fun.pullock.gof.behavioral.c5_4;

/**
 * 抽象迭代器
 */
interface Iterator<T> {

    /**
     * 移动到第一个元素
     */
    void first();

    /**
     * 移动到下一个元素
     */
    void next();

    /**
     * 是否遍历结束
     */
    boolean isDone();

    /**
     * 获取当前元素
     */
    T currentItem();
}
