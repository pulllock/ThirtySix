package fun.pullock.gof.behavioral.c5_4;

public class Client {

    public static void main(String[] args) {

        String[] names = {
                "Tom",
                "Jack",
                "Lucy",
                "Marry"
        };

        Aggregate<String> aggregate = new ConcreteAggregate<>(names);

        Iterator<String> iterator = aggregate.createIterator();

        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}