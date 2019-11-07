package Program;

import Drawer.Drawer;
import GameEntity.Enemy.EnemyManager;
import GameEntity.GameTile.Tower.TowerManager;
import Map.Map;
import javafx.scene.canvas.GraphicsContext;

public class Controller {
    private Map map;
    private GameManager gameManager;
    private GraphicsContext graphicsContext;

    public Controller(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;

        gameManager = new GameManager();
        if (gameManager.init()){
            map = gameManager.map;
            System.out.println("initialize game manager successful");
            EnemyManager.createNormalEnemy();
            TowerManager.createTower("NormalTower", map.map[0][0]);
        }else System.out.println("fail to initialize game manager");

        if(Drawer.init(graphicsContext, map, gameManager)){
            System.out.println("initialize drawer successful");
        } else System.out.println("fail to initialize drawer");


    }

    public void start(){
        Drawer.draw();
    }
}
