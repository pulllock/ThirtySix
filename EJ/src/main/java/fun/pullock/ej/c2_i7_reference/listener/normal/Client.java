package fun.pullock.ej.c2_i7_reference.listener.normal;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Listener listener = new MyListener();

        EventBus.register(listener);

        System.out.println(EventBus.getListeners().size());

        listener = null;

        System.gc();

        Thread.sleep(1000);

        System.out.println(EventBus.getListeners().size());
    }
}
