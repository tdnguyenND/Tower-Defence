package Drawer.DrawGameObject;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import javafx.scene.image.Image;

import java.io.File;

public class DrawEnemy extends DrawEntity {
    public static void setImage(GameObject gameObject, Enemy enemy) {
        graphicsContext.drawImage(gameObject.getImage(), enemy.getLocation().getY() - enemy.getWidth() / 2, enemy.getLocation().getX() - enemy.getHeight() / 2, enemy.getHeight(), enemy.getWidth());
    }

    public static void drawEnemy(Enemy enemy) {
        setImage(enemy, enemy);
    }
}
