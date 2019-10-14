package GameEntity.Enemy;

import Program.Config;

public class TankerEnemy extends Enemy{
    public TankerEnemy() {
        super(Config.TANKER_ENEMY_HEALTH, Config.TANKER_ENEMY_ARMOR,
                Config.TANKER_ENEMY_SPEED, Config.TANKER_ENEMY_DAMAGE,
                Config.TANKER_ENEMY_WIDTH, Config.TANKER_ENEMY_HEIGHT,
                Config.TANKER_ENEMY_REWARD);
    }
}
