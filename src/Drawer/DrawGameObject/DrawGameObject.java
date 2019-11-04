package Drawer.DrawGameObject;

import GameEntity.Bullet.Bullet;
import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import javafx.scene.canvas.GraphicsContext;

public abstract class DrawGameObject {
    protected static GraphicsContext graphicsContext;

    public static void init(GraphicsContext _graphicsContext){
        graphicsContext = _graphicsContext;
    }

    public static void setColor(GameObject gameObject){// should be abstract method
        graphicsContext.setFill(gameObject.getColor());
    }
}
