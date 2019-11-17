package GameEntity.Enemy;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.File;

public class TankerEnemy extends Enemy{
    public TankerEnemy() {
        super(EnemyConfig.TANKER_ENEMY_HEALTH, EnemyConfig.TANKER_ENEMY_ARMOR,
                EnemyConfig.TANKER_ENEMY_SPEED, EnemyConfig.TANKER_ENEMY_WIDTH,
                EnemyConfig.TANKER_ENEMY_HEIGHT, EnemyConfig.TANKER_ENEMY_REWARD);
        File file = new File("G:/documents/oop/java program/Tower-Defence/image/tanker-enemy.png");
        String localURL = file.toURI().toString();
        image = new Image(localURL);
    }
}
