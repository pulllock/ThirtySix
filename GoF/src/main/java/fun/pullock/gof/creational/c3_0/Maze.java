package fun.pullock.gof.creational.c3_0;

import java.util.ArrayList;
import java.util.List;

/**
 * 代表房间集合
 */
public class Maze {

    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room getRoom(int roomNo) {
        return rooms.get(roomNo - 1);
    }
}
