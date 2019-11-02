package Drawer;

import Drawer.DrawGameObject.*;
import Program.GameManager;
import Map.*;
import javafx.scene.canvas.GraphicsContext;

public class Drawer {
    public static void init(GraphicsContext graphicsContext, Map map, GameManager gameManager){
        DrawField.init(graphicsContext, map);
        DrawEnity.init(graphicsContext, gameManager);
    }

    public static void draw(){
        DrawField.draw();
        DrawEnity.draw();
    }
}
