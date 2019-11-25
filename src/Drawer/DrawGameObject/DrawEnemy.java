package Drawer.DrawGameObject;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.io.File;

public class DrawEnemy extends DrawEntity {

    private static int healthBarWidth = 40;
    private static int healthBarHeight = 5;
    public static void setImage(GameObject gameObject, Enemy enemy) {

        ImageView iv = new ImageView(gameObject.getImage());
        if (enemy.getDirection()[0] == -1){
            iv.setRotate(0);
        }
        else if (enemy.getDirection()[0] == 1){
            iv.setRotate(180);;
        }
        else if (enemy.getDirection()[1] == -1){
            iv.setRotate(-90);
        }
        else iv.setRotate(90);
        SnapshotParameters params = new SnapshotParameters();
        params.setFill(Color.TRANSPARENT);
        Image rotatedImage = iv.snapshot(params, null);
        graphicsContext.drawImage(rotatedImage, enemy.getLocation().getY() - enemy.getWidth() / 2, enemy.getLocation().getX() - enemy.getHeight() / 2, enemy.getWidth(), enemy.getHeight());
        if (enemy.getAttackCountDown() != 0) drawHealthBar(enemy);
    }

    public static void drawEnemy(Enemy enemy) {
        setImage(enemy, enemy);
    }

    public static void drawHealthBar(Enemy enemy){
        double rate = enemy.getHealthRate();
        graphicsContext.setStroke(Color.BLACK);
        graphicsContext.strokeRect(enemy.getLocation().getY() - healthBarWidth/2, enemy.getLocation().getX() - enemy.getHeight()/2 - healthBarHeight, healthBarWidth, healthBarHeight);
        if (rate < 0.3) graphicsContext.setFill(Color.RED);
        else if (rate < 0.7) graphicsContext.setFill(Color.YELLOWGREEN);
        else graphicsContext.setFill(Color.LIGHTGREEN);
        graphicsContext.fillRect(enemy.getLocation().getY() - healthBarWidth/2, enemy.getLocation().getX() - enemy.getHeight()/2 - healthBarHeight, healthBarWidth * (enemy.getHealthRate()), healthBarHeight);
    }
}
