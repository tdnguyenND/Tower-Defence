package Drawer;

import Drawer.DrawGameObject.*;
import Program.Config;
import Program.GameManager;
import Map.*;
import Program.Player;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Drawer {
    protected static GraphicsContext graphicsContext;

    protected static Player player;

    public static boolean init(GraphicsContext _graphicsContext, Map map, GameManager gameManager, Player _player){
        if (_graphicsContext == null) {
            System.out.println("graphics is null");
            return false;
        }
        graphicsContext = _graphicsContext;
        player = _player;
        return DrawField.init(graphicsContext, map) && DrawEnity.init(graphicsContext, gameManager);
    }

    public static void draw(){
        DrawField.draw();
        DrawEnity.draw();
        DrawGold.draw();
    }
}
