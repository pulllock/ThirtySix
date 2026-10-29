package fun.pullock.gof.structural.c4_1_Adapter.clazz;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
