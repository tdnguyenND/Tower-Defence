package Drawer;

import Drawer.DrawGameObject.*;
import Program.GameManager;
import Map.*;
import Program.Player;
import javafx.scene.canvas.GraphicsContext;

public class Drawer {
    protected static GraphicsContext graphicsContext;

    protected static Player player;

    public static boolean init(Map map, GameManager gameManager, Player _player){
        player = _player;
        return DrawField.init(map) && DrawEntity.init(gameManager);
    }

    public static void draw(){
        DrawField.draw();
        DrawEntity.draw();
        DrawGold.draw();
    }

    public static void setGraphicsContext(GraphicsContext graphicsContext) {
        Drawer.graphicsContext = graphicsContext;
    }
}
