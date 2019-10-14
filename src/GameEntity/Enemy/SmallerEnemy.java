package GameEntity.Enemy;

import Program.Config;

public class SmallerEnemy extends Enemy {
    public SmallerEnemy() {
        super(Config.SMALLER_ENEMY_HEALTH, Config.SMALLER_ENEMY_ARMOR,
                Config.SMALLER_ENEMY_SPEED, Config.SMALLER_ENEMY_DAMAGE,
                Config.SMALLER_ENEMY_WIDTH, Config.SMALLER_ENEMY_HEIGHT,
                Config.SMALLER_ENEMY_REWARD);
    }
}
