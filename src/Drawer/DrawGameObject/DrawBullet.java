package Drawer.DrawGameObject;

import GameEntity.Bullet.Bullet;
import GameEntity.Bullet.InfernoBullet;
import javafx.scene.paint.Color;

public class DrawBullet extends DrawEntity{
    public static void drawBullet(Bullet bullet){
        graphicsContext.setFill(Color.PINK);
        if (bullet instanceof InfernoBullet){
            graphicsContext.setLineWidth(1);
            graphicsContext.strokeLine(bullet.getLocation().getY(),bullet.getLocation().getX(), bullet.target.getLocation().getY(), bullet.target.getLocation().getX());
        }
        else {
            graphicsContext.fillOval(bullet.getLocation().getY() - bullet.getWidth() / 2, bullet.getLocation().getX() - bullet.getHeight() / 2,
                    bullet.getHeight(), bullet.getWidth());
        }
    }
}
