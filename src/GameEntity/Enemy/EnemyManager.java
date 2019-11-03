package GameEntity.Enemy;

import Debugger.Log;
import Map.Map;
import Program.Player;

import java.util.ArrayList;

public class EnemyManager {
    /**
     * TODO:
     *  -Call init method first
     */
    public static ArrayList<Enemy> listEnemy;
    private static Map map;
    private static Player player;

    public static boolean init(Player _player, Map _map){
        /**
         * TODO:
         *  - initialise Enemy (load static data for all enemy)
         *  - load this static data (player and map)
         *  - declare listEnemy
         */
        boolean success = true;
        player = _player;
        map = _map;

        Enemy.init(map, player);

        try{
            if (player == null) throw new Exception("player is null");
            player = _player;
        }catch (Exception e){
            success = false;
            Log.log(e);
        }
        try{
            if (map == null) throw  new Exception("map is null");
            map = _map;
        }catch (Exception e){
            success = false;
            System.out.println(e.getMessage());
        }
        listEnemy = new ArrayList<Enemy>();
        return success;
    }

    private static void addEnemy(Enemy enemy){
        listEnemy.add(enemy);
    }

    public static void createNormalEnemy(){
        Enemy newEnemy = new NormalEnemy();
        addEnemy(newEnemy);
    }

    public static void createSmallerEnemy(){
        Enemy newEnemy = new SmallerEnemy();
        addEnemy(newEnemy);
    }

    public static void createBossEnemy(){
        Enemy newEnemy = new BossEnemy();
        addEnemy(newEnemy);
    }

    public static void deleteEnemy(Enemy enemy){
        listEnemy.remove(enemy);
    }

    public static void update(){
        /**
         * TODO:
         *  - Create new Enemy
         *  - Update all Enemy
         */

        for (Enemy enemy: listEnemy) enemy.update();
    }
}
