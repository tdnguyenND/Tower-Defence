package GameEntity.Enemy;

import javafx.scene.paint.Color;

public class SmallerEnemy extends Enemy implements EnemyProperty {
    public SmallerEnemy() {
        super(SMALLER_ENEMY_HEALTH, SMALLER_ENEMY_ARMOR,
                SMALLER_ENEMY_SPEED, SMALLER_ENEMY_WIDTH,
                SMALLER_ENEMY_HEIGHT, SMALLER_ENEMY_REWARD);
        color = Color.YELLOW;
    }
}
