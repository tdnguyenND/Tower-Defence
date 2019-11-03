package Program;

import Drawer.Drawer;
import Map.Map;
import javafx.scene.canvas.GraphicsContext;
import Map.*;
import javafx.scene.paint.Color;

public class Controller {
    private Map map;
    private GameManager gameManager;
    private GraphicsContext graphicsContext;

    public Controller(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;

        gameManager = new GameManager();
        gameManager.init();

        map = gameManager.map;

        Drawer.init(graphicsContext, map, gameManager);
    }

    public void start(){
        Drawer.draw();
    }
}
