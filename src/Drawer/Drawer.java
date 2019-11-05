package Drawer;

import Drawer.DrawGameObject.*;
import Program.GameManager;
import Map.*;
import javafx.scene.canvas.GraphicsContext;

public class Drawer {
    public static boolean init(GraphicsContext graphicsContext, Map map, GameManager gameManager){
        if (graphicsContext == null) {
            System.out.println("graphics is null");
            return false;
        }
        return DrawField.init(graphicsContext, map) && DrawEnity.init(graphicsContext, gameManager);
    }

    public static void draw(){
        DrawField.draw();
        DrawEnity.draw();
    }
}
