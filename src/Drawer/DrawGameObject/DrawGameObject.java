package Drawer.DrawGameObject;

import GameEntity.GameObject;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public abstract class DrawGameObject {
    private static GraphicsContext graphicsContext;

    public static void init(GraphicsContext _graphicsContext){
        graphicsContext = _graphicsContext;
    }

    public static void draw(GameObject gameObject){// should be abstract method
        graphicsContext.setFill(Paint.valueOf(gameObject.getColor()));
        graphicsContext.fillRect(gameObject.getLocation().getX() - gameObject.getHeight()/2, gameObject.getLocation().getY() - gameObject.getWidth()/2,
                gameObject.getHeight(), gameObject.getWidth());
    };
}
