package fun.pullock.gof.creational.c3_0;

/**
 * 创建迷宫
 *
 * 这是一种简单的直接创建迷宫的方法：使用一系列操作将构件增加到迷宫中，然后连接它们。
 */
public class MazeGame {

    /**
     * 创建一个迷宫，有两个房间
     * @return 有两个房间的迷宫
     */
    public Maze createMaze() {
        Maze maze = new Maze();

        Room room1 = new Room(1);
        Room room2 = new Room(2);

        Door door = new Door(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.North, new Wall());
        room1.setSide(Direction.East, door);
        room1.setSide(Direction.South, new Wall());
        room1.setSide(Direction.West, new Wall());

        room2.setSide(Direction.North, new Wall());
        room2.setSide(Direction.East, new Wall());
        room2.setSide(Direction.South, new Wall());
        room2.setSide(Direction.West, door);

        return maze;
    }
}
