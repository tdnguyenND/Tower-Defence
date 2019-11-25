package GameEntity.Enemy;

public class EnemyConfig {
    static final double NORMAL_ENEMY_HEALTH = 300;
    static final double NORMAL_ENEMY_ARMOR= 10;
    static final int NORMAL_ENEMY_SPEED = 3;
    static final double NORMAL_ENEMY_WIDTH = 50;
    static final double NORMAL_ENEMY_HEIGHT = 50;
    static final int NORMAL_ENEMY_REWARD = 30;

    static final double TANKER_ENEMY_HEALTH = 450;
    static final double TANKER_ENEMY_ARMOR= 15;
    static final int TANKER_ENEMY_SPEED = 2;
    static final double TANKER_ENEMY_WIDTH = 50;
    static final double TANKER_ENEMY_HEIGHT = 50;
    static final int TANKER_ENEMY_REWARD = 20;

    static final double SMALLER_ENEMY_HEALTH = 200;
    static final double SMALLER_ENEMY_ARMOR= 6;
    static final int SMALLER_ENEMY_SPEED = 4;
    static final double SMALLER_ENEMY_WIDTH = 50;
    static final double SMALLER_ENEMY_HEIGHT = 50;
    static final int SMALLER_ENEMY_REWARD = 50;

    static final double BOSS_ENEMY_HEALTH = 500;
    static final double BOSS_ENEMY_ARMOR= 25;
    static final int BOSS_ENEMY_SPEED = 2;
    static final double BOSS_ENEMY_WIDTH = 50;
    static final double BOSS_ENEMY_HEIGHT = 50;
    static final int BOSS_ENEMY_REWARD = 70;

    static final int loop = 12;
    static final int enemyAttackTimeSet = 200;

    static final int defaultCounter = 20 * loop;
    static final int waveCounter = 200 * loop;// time between two ways

}
