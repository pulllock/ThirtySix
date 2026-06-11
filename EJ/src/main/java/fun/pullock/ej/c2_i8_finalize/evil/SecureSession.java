package fun.pullock.ej.c2_i8_finalize.evil;

public class SecureSession {

    private final String token;

    public SecureSession(String token) {
        if (!isValid(token)) {
            throw new SecurityException();
        }

        this.token = token;
    }

    public void transferMoney() {
        System.out.println("转账成功");
    }

    boolean isValid(String token) {
       if (token == null) {
           return false;
       }

       return true;
    }
}