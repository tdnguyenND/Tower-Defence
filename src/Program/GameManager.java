package Program;

import GameEntity.Bullet.BulletManager;
import GameEntity.Enemy.EnemyManager;
import GameEntity.GameTile.Tower.TowerManager;
import Map.Map;

public class GameManager {
    public Map map;
    public static Player player;
    //private GraphicsContext graphicsContext;

    public GameManager(){
        map = new Map();
        player = new Player();
        player.setGold(Config.defaultPlayerGold);
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

    public static void restart(){
        EnemyManager.restart();
        TowerManager.restart();
        BulletManager.restart();
        player.restart();
    }
}
