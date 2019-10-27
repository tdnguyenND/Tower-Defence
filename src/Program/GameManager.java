package Program;

import GameEntity.Enemy.EnemyManager;
import Map.Map;

public class GameManager {
    public static void init(){
        /**
         *  TODO:
         *   - Initialize BulletManager, EnemyManager, TowerManager
         */
        Map.init();
        Map map = new Map();
        Player player = new Player();

        EnemyManager.init(player, map);
        /**
         *  TODO:
         *   - BulletManager.init
         *   - TowerManager.init
         */

    }
}
