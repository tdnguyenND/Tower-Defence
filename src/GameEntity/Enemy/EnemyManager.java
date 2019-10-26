package GameEntity.Enemy;

import Map.Map;
import Program.Player;

import java.util.ArrayList;

public class EnemyManager {
    /**
     * TODO:
     *  -Call init method first
     */
    private static ArrayList<Enemy> listEnemy;
    private static Map map;
    private static Player player;

    public static void init(Player _player, Map _map){
        /**
         * TODO:
         *  - initialise Enemy (load static data for all enemy)
         *  - load this static data (player and map)
         *  - declare listEnemy
         */
        Enemy.init(map, player);
        try{
            if (player == null) throw new Exception("player is null");
            player = _player;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            if (map == null) throw  new Exception("map is null");
            map = _map;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        listEnemy = new ArrayList<Enemy>();
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

}
