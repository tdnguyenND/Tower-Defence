package Drawer.DrawGameObject;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import javafx.scene.image.Image;

import java.io.File;

public class DrawEnemy extends DrawEntity {
    public static void setColor(GameObject gameObject) {
        graphicsContext.setFill(gameObject.getColor());
    }

    public static void drawEnemy(Enemy enemy) {
        File file = new File("G:/documents/oop/java program/Tower-Defence/image/boss-enemy.png");
        String localURL = file.toURI().toString();
        Image image = new Image(localURL);

        graphicsContext.drawImage(image, enemy.getLocation().getY() - enemy.getWidth() / 2, enemy.getLocation().getX() - enemy.getHeight() / 2, enemy.getHeight(), enemy.getWidth());

    }
}
