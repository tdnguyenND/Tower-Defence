package Program;

import Drawer.Drawer;
import GameEntity.Enemy.Enemy;
import GameEntity.Enemy.EnemyManager;
import Map.Map;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

public class Controller extends AnimationTimer {
    private Map map;
    private GameManager gameManager;
    private GraphicsContext graphicsContext;

    public Controller(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;

        gameManager = new GameManager();
        if (gameManager.init()){
            map = gameManager.map;
            System.out.println("initialize game manager successful");
        }else System.out.println("fail to initialize game manager");

        if(Drawer.init(graphicsContext, map, gameManager)){
            System.out.println("initialize drawer successful");
        } else System.out.println("fail to initialize drawer");
    }

    @Override
    public void handle(long l) {
        /**
         * TODO:
         *  - Update
         *  - Draw
         *  - Sleep
         */
        GameManager.update();
        Drawer.draw();
    }

    public void start(){
        Drawer.draw();
        super.start();
    }
}
