package fun.pullock.ej.c2_i8_finalize.evil;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        EvilSession session = null;

        try {
            session = new EvilSession();
        } catch (Exception e) {
        }

        System.gc();

        Thread.sleep(1000);

        System.out.println(EvilSession.saved);
        EvilSession.saved.transferMoney();
    }
}
