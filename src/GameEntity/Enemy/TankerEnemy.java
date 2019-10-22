package GameEntity.Enemy;

public class TankerEnemy extends Enemy implements EnemyProperty{
    public TankerEnemy() {
        super(TANKER_ENEMY_HEALTH, TANKER_ENEMY_ARMOR,
                TANKER_ENEMY_SPEED, TANKER_ENEMY_WIDTH,
                TANKER_ENEMY_HEIGHT, TANKER_ENEMY_REWARD);
    }
}
