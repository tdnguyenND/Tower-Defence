package Drawer.DrawGameObject;

import GameEntity.Enemy.Enemy;
import javafx.scene.image.Image;
import Map.Data;
import GameEntity.Enemy.Enemy;

import java.io.File;



public class DrawEnemy extends DrawGameObject {
    public static void drawEnemy(Enemy enemy){
        File file = new File("G:/projects/Tower Defense/game-03.png");
        String localURL = file.toURI().toString();
        Image image = new Image(localURL);

        if(Enemy.getDirection() == Data.direction[2]) {
            graphicsContext.drawImage(image, enemy.getLocation().getY() - enemy.getWidth() / 2, enemy.getLocation().getX() - enemy.getHeight() / 2);
            graphicsContext.rotate(90);
        }
        else{
            graphicsContext.drawImage(image, enemy.getLocation().getY() - enemy.getWidth() / 2, enemy.getLocation().getX() - enemy.getHeight() / 2);
        }

    }
}
