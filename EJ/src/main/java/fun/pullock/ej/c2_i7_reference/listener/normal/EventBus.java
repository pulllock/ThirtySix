package fun.pullock.ej.c2_i7_reference.listener.normal;

import java.util.ArrayList;
import java.util.List;

public class EventBus {

    private static final List<Listener> listeners = new ArrayList<>();

    public static void register(Listener listener) {
        listeners.add(listener);
    }

    public static List<Listener> getListeners() {
        return listeners;
    }
}