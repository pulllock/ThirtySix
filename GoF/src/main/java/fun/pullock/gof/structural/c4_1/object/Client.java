package fun.pullock.gof.structural.c4_1.object;

public class Client {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());

        target.request();
    }
}
