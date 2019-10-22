package GameEntity.GameTile.Tower;

import GameEntity.Bullet.Bullet;
import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import Program.Position;

import java.util.ArrayList;

public abstract class Tower extends GameObject {
    protected double range;
    protected boolean point;

    protected double width;
    protected double height;

    public Tower(Position pos, double range){
        this.position = pos;
        this.range = range;
    }

    abstract void fire(ArrayList<Enemy> enemyList);

    public Enemy fireAble(ArrayList<Enemy> enemy_list){
        if(!point){
            double distance = position.distance(enemy_list.get(0).getLocation());
            int n = enemy_list.size();
            for(int i = 0; i < n; i ++){
                distance = position.distance(enemy_list.get(i).getLocation());
                if(distance <= range){
                    point = true;
                    return enemy_list.get(i);
                }
            }
        }
        return null;
    }



}
