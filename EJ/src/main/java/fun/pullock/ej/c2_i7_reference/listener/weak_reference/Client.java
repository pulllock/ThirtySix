package fun.pullock.ej.c2_i7_reference.listener.weak_reference;

import java.lang.ref.WeakReference;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Listener listener = new MyListener();

        WeakReference<Listener> weakReference = new WeakReference<>(listener);

        EventBus.register(weakReference);

        System.out.println(EventBus.getListeners().size());

        WeakReference<Listener> ref = EventBus.getListeners().get(0);
        System.out.println(ref.get());

        listener = null;

        System.gc();

        Thread.sleep(1000);

        System.out.println(EventBus.getListeners().size());
        System.out.println(ref.get());
    }
}
