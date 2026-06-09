package fun.pullock.ej.c2_i3_provider.normal;

public class Cache<T> {

    private T value;

    public T getOrCreate(Creator<T> creator) {
        if (value == null) {
            value = creator.create();
        }

        return value;
    }
}