package GameEntity.Enemy;

public class BossEnemy extends Enemy implements EnemyProperty{
    public BossEnemy() {
        super(BOSS_ENEMY_HEALTH, BOSS_ENEMY_ARMOR,
                BOSS_ENEMY_SPEED, BOSS_ENEMY_DAMAGE,
                BOSS_ENEMY_WIDTH, BOSS_ENEMY_HEIGHT,
                BOSS_ENEMY_REWARD);
    }
}
