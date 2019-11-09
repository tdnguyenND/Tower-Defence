package Program;

import GameEntity.Bullet.Bullet;
import GameEntity.Bullet.BulletManager;
import GameEntity.Enemy.EnemyManager;
import GameEntity.GameTile.Tower.TowerManager;
import Map.Map;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GameManager {
    public Map map;
    public Player player;
    //private GraphicsContext graphicsContext;

    public GameManager(){
        map = new Map();
        player = new Player();
        player.setGold(500);
    }
    public boolean init(){
        /**
         *  TODO:
         *   - Initialize BulletManager, EnemyManager, TowerManager
         */

        map.init();

        /**
         *  TODO:
         *   - EnemyManage.init
         *   - BulletManager.init
         *   - TowerManager.init
         */
        return EnemyManager.init(player, map) && TowerManager.init(player)  && BulletManager.init();
    }


    public static void update(){
        EnemyManager.update();
        TowerManager.update();
        BulletManager.update();
    }
}
