package fun.pullock.gof.structural.c4_5;

public class Facade {

    private SubSystem1 subSystem1;

    private SubSystem2 subSystem2;

    public Facade() {
        this.subSystem1 = new SubSystem1();
        this.subSystem2 = new SubSystem2();
    }

    public void operation() {
        subSystem1.system1Operation();
        subSystem2.system2Operation();
    }
}
