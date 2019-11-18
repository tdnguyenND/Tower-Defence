package Drawer.DrawGameObject;

import GameEntity.GameObject;
import javafx.scene.canvas.GraphicsContext;

public abstract class DrawGameObject {
    protected static GraphicsContext graphicsContext;

    public static void setColor(GameObject gameObject){// should be abstract method
        graphicsContext.setFill(gameObject.getColor());
    }
}
