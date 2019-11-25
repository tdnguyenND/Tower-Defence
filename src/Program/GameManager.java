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
    public static long updateLoop;

    public static long getPreviousTick() {
        return previousTick;
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
        previousTick = 0;
        previousTime = System.nanoTime();
    }

    public static void update(){
        long currentTime = System.nanoTime();
        if (currentTime - previousTime > updateLoop){
            long tick = previousTick + (currentTime - previousTime)/updateLoop;
            previousTime = currentTime;

            while (previousTick < tick){
                previousTick ++;
                TowerManager.update(previousTick);
                EnemyManager.update(previousTick);
                BulletManager.update(previousTick);
            }
        }
    }

    public static void restart(){
        previousTick = 0;
        previousTime = System.nanoTime();
        EnemyManager.restart();
        TowerManager.restart();
        BulletManager.restart();
        player.restart();
        setStart();
    }
}
