package Drawer.DrawGameObject;

import GameEntity.Bullet.Bullet;
import javafx.scene.paint.Color;

public class DrawBullet extends DrawGameObject{
    public static void drawBullet(Bullet bullet){
        graphicsContext.setFill(Color.PINK);
        graphicsContext.fillOval(bullet.getLocation().getY() - bullet.getWidth()/2,bullet.getLocation().getX() - bullet.getHeight()/2,
                bullet.getHeight(), bullet.getWidth());
    }
}
