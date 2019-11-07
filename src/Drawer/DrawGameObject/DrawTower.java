package Drawer.DrawGameObject;

import GameEntity.GameTile.Tower.Tower;
import javafx.scene.paint.Color;

public class DrawTower extends DrawGameObject {
    public static void drawTower(Tower tower){
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(tower.getLocation().getY() - tower.getWidth()/2,tower.getLocation().getX() - tower.getHeight()/2,
                tower.getHeight(), tower.getWidth());
    }
}
