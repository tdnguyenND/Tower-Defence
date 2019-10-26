package Map;

public class Data {
    public static final int[][] line = {{0, 0}, {0,1}, {0,2}, {0,3}, {0,4}}; // change this
    public static final int size = line.length;

    public static final int[] startPoint = line[0];
    public static final int[] finishPoint = line[size -1];

    public static final int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private Data(){};
}
