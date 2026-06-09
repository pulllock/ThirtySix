package fun.pullock.ej.c2_i3_singleton.generic_factory.specialized;

@FunctionalInterface
public interface UnaryOperator<T> {

    T apply(T value);
}
