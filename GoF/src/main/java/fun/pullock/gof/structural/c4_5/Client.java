package fun.pullock.gof.structural.c4_5;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}
