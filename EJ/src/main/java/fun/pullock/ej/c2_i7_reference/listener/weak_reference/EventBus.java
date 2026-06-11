package fun.pullock.ej.c2_i7_reference.listener.weak_reference;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class EventBus {

    private static final List<WeakReference<Listener>> listeners = new ArrayList<>();

    public static void register(WeakReference<Listener> listener) {
        listeners.add(listener);
    }

    public static List<WeakReference<Listener>> getListeners() {
        return listeners;
    }
}