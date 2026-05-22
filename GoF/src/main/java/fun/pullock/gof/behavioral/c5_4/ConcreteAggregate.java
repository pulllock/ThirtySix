package fun.pullock.gof.behavioral.c5_4;

/**
 * 具体聚合
 */
class ConcreteAggregate<T> implements Aggregate<T> {

    private T[] items;

    public ConcreteAggregate(T[] items) {
        this.items = items;
    }

    public T getItem(int index) {
        return items[index];
    }

    public int size() {
        return items.length;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }
}