package fun.pullock.gof.behavioral.c5_4;

/**
 * 具体迭代器
 */
class ConcreteIterator<T> implements Iterator<T> {

    /**
     * 被遍历的聚合对象
     */
    private ConcreteAggregate<T> aggregate;

    /**
     * 当前游标位置
     */
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        current = 0;
    }

    @Override
    public void next() {
        if (current < aggregate.size()) {
            current++;
        }
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.size();
    }

    @Override
    public T currentItem() {
        if (isDone()) {
            throw new IndexOutOfBoundsException("迭代结束");
        }

        return aggregate.getItem(current);
    }
}