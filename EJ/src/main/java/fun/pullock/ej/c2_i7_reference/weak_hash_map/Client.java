package fun.pullock.ej.c2_i7_reference.weak_hash_map;

import java.util.Map;
import java.util.WeakHashMap;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Map<Object, String> cache = new WeakHashMap<>();
        Object key = new Object();
        cache.put(key, "Hello");

        System.out.println(cache.size());

        key = null;

        System.gc();

        Thread.sleep(1000);

        System.out.println(cache.size());
    }
}
