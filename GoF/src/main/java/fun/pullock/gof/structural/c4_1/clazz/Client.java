package fun.pullock.gof.structural.c4_1.clazz;

public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
