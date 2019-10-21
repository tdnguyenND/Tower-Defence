package GameEntity.Enemy;

public class NormalEnemy extends Enemy implements EnemyProperty {

    public NormalEnemy() {
        super(NORMAL_ENEMY_HEALTH, NORMAL_ENEMY_ARMOR,
                NORMAL_ENEMY_SPEED, NORMAL_ENEMY_DAMAGE,
                NORMAL_ENEMY_WIDTH, NORMAL_ENEMY_HEIGHT,
                NORMAL_ENEMY_REWARD);
    }
}
