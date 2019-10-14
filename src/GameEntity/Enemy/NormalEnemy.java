package GameEntity.Enemy;

import Program.Config;
import Program.Position;

public class NormalEnemy extends Enemy {

    public NormalEnemy() {
        super(Config.NORMAL_ENEMY_HEALTH, Config.NORMAL_ENEMY_ARMOR,
                Config.NORMAL_ENEMY_SPEED, Config.NORMAL_ENEMY_DAMAGE,
                Config.NORMAL_ENEMY_WIDTH, Config.NORMAL_ENEMY_HEIGHT,
                Config.NORMAL_ENEMY_REWARD);
    }
}
