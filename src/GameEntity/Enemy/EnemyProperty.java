package GameEntity.Enemy;

public interface EnemyProperty {
    double NORMAL_ENEMY_HEALTH = 100;
    double NORMAL_ENEMY_ARMOR= 10;
    int NORMAL_ENEMY_SPEED = 2;
    double NORMAL_ENEMY_WIDTH = 10;
    double NORMAL_ENEMY_HEIGHT = 10;
    int NORMAL_ENEMY_REWARD = 1;

    double TANKER_ENEMY_HEALTH = 300;
    double TANKER_ENEMY_ARMOR= 15;
    int TANKER_ENEMY_SPEED = 2;
    double TANKER_ENEMY_WIDTH = 16;
    double TANKER_ENEMY_HEIGHT = 16;
    int TANKER_ENEMY_REWARD = 5;

    double SMALLER_ENEMY_HEALTH = 25;
    double SMALLER_ENEMY_ARMOR= 6;
    int SMALLER_ENEMY_SPEED = 32;
    double SMALLER_ENEMY_WIDTH = 6;
    double SMALLER_ENEMY_HEIGHT = 6;
    int SMALLER_ENEMY_REWARD = 1;

    double BOSS_ENEMY_HEALTH = 2800;
    double BOSS_ENEMY_ARMOR= 25;
    int BOSS_ENEMY_SPEED = 16;
    double BOSS_ENEMY_WIDTH = 14;
    double BOSS_ENEMY_HEIGHT = 14;
    int BOSS_ENEMY_REWARD = 25;
}
