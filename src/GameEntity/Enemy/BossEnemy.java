package GameEntity.Enemy;

import Program.Config;

public class BossEnemy extends Enemy{
    public BossEnemy() {
        super(Config.BOSS_ENEMY_HEALTH, Config.BOSS_ENEMY_ARMOR,
                Config.BOSS_ENEMY_SPEED, Config.BOSS_ENEMY_DAMAGE,
                Config.startPoint, Config.BOSS_ENEMY_WIDTH,
                Config.BOSS_ENEMY_HEIGHT, Config.BOSS_ENEMY_REWARD);
    }
}
