package GameEntity.Enemy;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.File;

public class BossEnemy extends Enemy{
    public BossEnemy() {
        super(EnemyConfig.BOSS_ENEMY_HEALTH, EnemyConfig.BOSS_ENEMY_ARMOR,
                EnemyConfig.BOSS_ENEMY_SPEED, EnemyConfig.BOSS_ENEMY_WIDTH,
                EnemyConfig.BOSS_ENEMY_HEIGHT, EnemyConfig.BOSS_ENEMY_REWARD);
        File file = new File("G:/documents/oop/java program/Tower-Defence/image/boss-enemy.png");
        String localURL = file.toURI().toString();
        image = new Image(localURL);
    }
}
