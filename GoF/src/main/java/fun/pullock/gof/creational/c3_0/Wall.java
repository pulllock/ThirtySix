package fun.pullock.gof.creational.c3_0;

/**
 * 墙
 */
public class Wall extends MapSite{

    @Override
    public void enter() {
        System.out.println("撞墙上了。");
    }
}
