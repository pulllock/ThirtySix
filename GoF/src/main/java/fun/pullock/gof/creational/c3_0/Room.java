package fun.pullock.gof.creational.c3_0;

/**
 * 房间
 */
public class Room extends MapSite{

    /**
     * 房间号
     */
    private int roomNo;

    /**
     * 迷宫的每一面
     */
    private MapSite[] sides = new MapSite[4];

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setSide(Direction direction, MapSite side) {
        sides[direction.ordinal()] = side;
    }

    public MapSite getSide(Direction direction) {
        return sides[direction.ordinal()];
    }

    @Override
    public void enter() {
        System.out.println("进入房间：" + roomNo);
    }
}
