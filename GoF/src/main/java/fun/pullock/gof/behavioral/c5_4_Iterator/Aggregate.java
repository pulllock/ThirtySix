package fun.pullock.gof.behavioral.c5_4_Iterator;

/**
 * 抽象聚合
 */
interface Aggregate<T> {

    /**
     * 创建迭代器
     */
    Iterator<T> createIterator();
}
