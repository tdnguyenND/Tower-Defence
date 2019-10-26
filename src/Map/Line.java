package Map;

import Program.Position;

public class Line {
    public static int[][] line = {{0, 0}, {0,1}, {0,2}, {0,3}, {0,4}}; // change this
    public static int size = line.length;

    public static int[] startPoint = line[0];
    public static int[] finishPoint = line[size -1];

    public static int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private Line(){};
}
