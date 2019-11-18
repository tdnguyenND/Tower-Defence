package GameEntity.Enemy;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.File;

public class SmallerEnemy extends Enemy{
    public SmallerEnemy() {
        super(EnemyConfig.SMALLER_ENEMY_HEALTH, EnemyConfig.SMALLER_ENEMY_ARMOR,
                EnemyConfig.SMALLER_ENEMY_SPEED, EnemyConfig.SMALLER_ENEMY_WIDTH,
                EnemyConfig.SMALLER_ENEMY_HEIGHT, EnemyConfig.SMALLER_ENEMY_REWARD);
        File file = new File("src/data/image/smaller-enemy.png");
        String localURL = file.toURI().toString();
        image = new Image(localURL);
    }
}
