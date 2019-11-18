package GameEntity.Enemy;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.File;

public class NormalEnemy extends Enemy{

    public NormalEnemy() {
        super(EnemyConfig.NORMAL_ENEMY_HEALTH, EnemyConfig.NORMAL_ENEMY_ARMOR,
                EnemyConfig.NORMAL_ENEMY_SPEED, EnemyConfig.NORMAL_ENEMY_WIDTH,
                EnemyConfig.NORMAL_ENEMY_HEIGHT, EnemyConfig.NORMAL_ENEMY_REWARD);
        File file = new File("src/data/image/normal-enemy.png");
        String localURL = file.toURI().toString();
        image = new Image(localURL);
    }
}
