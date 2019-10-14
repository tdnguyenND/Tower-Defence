package Program;

public class Config {
    /**
     * save game config
     */
    public static final int GAME_FPS = 40;

    public static final double NORMAL_ENEMY_HEALTH = 45;
    public static final double NORMAL_ENEMY_ARMOR= 10;
    public static final double NORMAL_ENEMY_SPEED = 16;
    public static final double NORMAL_ENEMY_DAMAGE = 8;
    public static final double NORMAL_ENEMY_WIDTH = 5;
    public static final double NORMAL_ENEMY_HEIGHT = 5;
    public static final int NORMAL_ENEMY_REWARD = 1;

    public static final double TANKER_ENEMY_HEALTH = 300;
    public static final double TANKER_ENEMY_ARMOR= 15;
    public static final double TANKER_ENEMY_SPEED = 12;
    public static final double TANKER_ENEMY_DAMAGE = 11;
    public static final double TANKER_ENEMY_WIDTH = 8;
    public static final double TANKER_ENEMY_HEIGHT = 8;
    public static final int TANKER_ENEMY_REWARD = 5;

    public static final double SMALLER_ENEMY_HEALTH = 25;
    public static final double SMALLER_ENEMY_ARMOR= 6;
    public static final double SMALLER_ENEMY_SPEED = 32;
    public static final double SMALLER_ENEMY_DAMAGE = 6;
    public static final double SMALLER_ENEMY_WIDTH = 3;
    public static final double SMALLER_ENEMY_HEIGHT = 3;
    public static final int SMALLER_ENEMY_REWARD = 1;

    public static final double BOSS_ENEMY_HEALTH = 2800;
    public static final double BOSS_ENEMY_ARMOR= 25;
    public static final double BOSS_ENEMY_SPEED = 16;
    public static final double BOSS_ENEMY_DAMAGE = 240;
    public static final double BOSS_ENEMY_WIDTH = 7;
    public static final double BOSS_ENEMY_HEIGHT = 7;
    public static final int BOSS_ENEMY_REWARD = 25;

    public static Position startPoint = new Position(0,0);

    private Config(){
    }
}
