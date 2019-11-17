package Program;

public class Config {
    static final String GAME_NAME = "Tower-Defence";
    /**
     * save game config
     */
    public static int GRID_HEIGHT = 50;
    public static int GRID_WIDTH = 50;

    public static int ROW = 10;
    public static int COLUMN = 15;

    public static int FIELD_WIDTH = COLUMN* GRID_WIDTH;
    public static int FIELD_HEIGHT = ROW * GRID_HEIGHT;

    public static int SCREEN_WIDTH = FIELD_WIDTH ;
    public static int SCREEN_HEIGHT = FIELD_HEIGHT + 100;

    public static final int GAME_FPS = 20;
    public static final double COUNT = 1000000000.0/GAME_FPS;

    private Config(){
    }
}
