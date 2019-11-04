package Program;

import GameEntity.Enemy.EnemyManager;
import Map.Map;

public class GameManager {
    public Map map;
    public Player player;

    public GameManager(){
        map = new Map();
        player = new Player();
    }
    public boolean init(){
        /**
         *  TODO:
         *   - Initialize BulletManager, EnemyManager, TowerManager
         */
        boolean success = true;

        map.init();

        /**
         *  TODO:
         *   - EnemyManage.init
         *   - BulletManager.init
         *   - TowerManager.init
         */
        return EnemyManager.init(player, map) /* && BulletManager.init && TowerManager.init*/;
    }

    public static void update(){
        EnemyManager.update();
    }
}
