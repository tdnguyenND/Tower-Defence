package Program;

import GameEntity.Enemy.EnemyManager;
import GameEntity.GameTile.Tower.TowerManager;
import Map.Map;

public class GameManager {
    public Map map;
    public Player player;

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
        return EnemyManager.init(player, map) && TowerManager.init(player) /* && BulletManager.init */;
    }

    public static void update(){
        EnemyManager.update();
        TowerManager.update();
    }
}
