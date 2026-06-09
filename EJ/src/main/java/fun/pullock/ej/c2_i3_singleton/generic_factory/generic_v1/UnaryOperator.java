package fun.pullock.ej.c2_i3_singleton.generic_factory.generic_v1;

@FunctionalInterface
public interface UnaryOperator<T> {

    T apply(T value);
}
