package fun.pullock.utj.c6_3_7_exception;

public class ExceptionTable {

    public int inc() {
        int x;

        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }
}
