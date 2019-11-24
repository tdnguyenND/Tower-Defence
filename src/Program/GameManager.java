package Program;

import GameEntity.Bullet.BulletManager;
import GameEntity.Enemy.EnemyManager;
import GameEntity.GameTile.Tower.TowerManager;
import Map.Map;

public class GameManager {
    public Map map;
    public static Player player;
    //private GraphicsContext graphicsContext;

    private static long previousTime;
    private static long previousTick;
    private static long currentTick;// use tick as game's time
    public static long updateLoop;

    public static long getCurrentTick() {
        return currentTick;
    }

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
        updateLoop = Config.updateLoop;
        return EnemyManager.init(player, map) && TowerManager.init(player)  && BulletManager.init();
    }

    public static void setStart(){
        currentTick = 0;
        previousTick = 0;
        previousTime = System.nanoTime();
    }

    public static void update(){
        long currentTime = System.nanoTime();
        if (currentTime - previousTime > updateLoop){
            currentTick = (currentTime - previousTime)/updateLoop;
            previousTick += currentTick;
            previousTime = currentTime;
            EnemyManager.update(previousTick);
            TowerManager.update();
            BulletManager.update();
        }
    }

    public static void restart(){
        EnemyManager.restart();
        TowerManager.restart();
        BulletManager.restart();
        player.restart();
        setStart();
    }
}
