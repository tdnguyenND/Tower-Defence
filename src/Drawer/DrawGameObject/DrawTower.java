package Drawer.DrawGameObject;

import javafx.scene.paint.Color;

public class DrawTower extends DrawGameObject {
    public static void drawTower(Boolean tower){
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(tower.getLocation().getY() - tower.getWidth()/2,tower.getLocation().getX() - tower.getHeight()/2,
                tower.getHeight(), tower.getWidth());
    }
}
