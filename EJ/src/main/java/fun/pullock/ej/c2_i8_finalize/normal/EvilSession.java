package fun.pullock.ej.c2_i8_finalize.normal;

public class EvilSession extends SecureSession {

    static EvilSession saved;

    public EvilSession() {
        super(null);
    }

    @Override
    protected void finalize() {
    }
}