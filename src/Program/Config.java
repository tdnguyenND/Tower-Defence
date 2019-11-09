package Program;

public class Config {
    public static final String GAME_NAME = "Tower-Defence";
    /**
     * save game config
     */
    public static int GRID_HEIGHT = 40;
    public static int GRID_WIDTH = 40;

    public static int ROW = 15;
    public static int COLUMN = 20;

    public static int FIELD_WIDTH = COLUMN* GRID_WIDTH;
    public static int FIELD_HEIGHT = ROW * GRID_HEIGHT;

    public static int SCREEN_WIDTH = FIELD_WIDTH + 180;
    public static int SCREEN_HEIGHT = FIELD_HEIGHT;

    public static final int GAME_FPS = 40;

    private Config(){
    }
}
