package fun.pullock.gof.structural.c4_7;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println(
                "RealSubject: 执行业务逻辑"
        );
    }
}