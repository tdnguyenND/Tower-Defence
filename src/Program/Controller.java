package Program;

import Drawer.DrawGameObject.DrawTower;
import Drawer.Drawer;
import GameEntity.Enemy.EnemyManager;
import GameEntity.GameTile.Tower.NormalTower;
import GameEntity.GameTile.Tower.TowerManager;
import Map.Map;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import java.awt.*;

public class Controller extends AnimationTimer {
    private Map map;
    public GameManager gameManager;
    private GraphicsContext graphicsContext;

    public Controller(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;

        gameManager = new GameManager();
        if (gameManager.init()){
            map = gameManager.map;
            System.out.println("initialize game manager successful");
            EnemyManager.createNormalEnemy();
            TowerManager.createTower("NormalTower", map.map[13][3]);

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
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        Drawer.draw();
        super.start();
    }
}
