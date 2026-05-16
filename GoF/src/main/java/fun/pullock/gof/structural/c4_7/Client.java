package fun.pullock.gof.structural.c4_7;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
