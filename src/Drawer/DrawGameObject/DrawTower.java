package Drawer.DrawGameObject;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import GameEntity.GameTile.Tower.Tower;
import javafx.scene.image.Image;
import java.io.File;

public class DrawTower extends DrawEntity {
    public static void setImage(GameObject gameObject, Tower tower) {
        graphicsContext.drawImage(gameObject.getImage(), tower.getLocation().getY() - tower.getWidth() / 2, tower.getLocation().getX() - tower.getHeight() / 2, tower.getWidth(), tower.getHeight());
    }

    public static void drawTower(Tower tower) {
        setImage(tower, tower);
    }
}
