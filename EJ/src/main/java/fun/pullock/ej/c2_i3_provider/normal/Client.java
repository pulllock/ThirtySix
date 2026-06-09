package fun.pullock.ej.c2_i3_provider.normal;

public class Client {

    public static void main(String[] args) {
        Cache<User> cache = new Cache<>();

        cache.getOrCreate(new Creator<User>() {
            @Override
            public User create() {
                return new User();
            }
        });
    }
}
