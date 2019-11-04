package Drawer.DrawGameObject;

import GameEntity.GameTile.Tower.Tower;

public class DrawTower extends DrawGameObject {
    public static void drawTower(Tower tower){
        setColor(tower);
        graphicsContext.fillRect(tower.getLocation().getY() - tower.getWidth()/2,tower.getLocation().getX() - tower.getHeight()/2,
                tower.getHeight(), tower.getWidth());
    }
}
