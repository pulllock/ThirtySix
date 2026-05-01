package fun.pullock.gof.creational.c3_0;

/**
 * 所有迷宫构件的公共抽象类
 */
public abstract class MapSite {

    /**
     * enter操作的含义取决于你在进入哪里。
     * 如果进入一个房间，那么你的位置会发生改变。如果你试图进入一扇门，那么将会发生一下两件事之一：
     * 如果门开着，你将进入另一个房间；如果门是关着的，你会碰壁。
     */
    public abstract void enter();
}
