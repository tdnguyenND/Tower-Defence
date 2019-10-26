package GameEntity.GameTile.Tower;

import GameEntity.Bullet.Bullet;
import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import Program.Position;

import java.util.ArrayList;

public abstract class Tower extends GameObject {
    protected double range, attackRate;
    protected int damage;
    protected int cost;
    protected Bullet bullet;

    protected Enemy enemy;
    protected double lastAttacked;

    protected double width, height;

    public Tower(Position pos, double range, double attackRate, int damage, int cost){
        this.position = pos;
        this.range = range;
        this.damage = damage;
        this.cost = cost;
        this.attackRate = attackRate;
        this.lastAttacked = 0;
    }

    public int getCost(){
        return cost;
    }

    public double getAttackRate() {
        return attackRate;
    }

    public int getDamage() {
        return damage;
    }

    public Enemy getEnemy() { return enemy; }

    public void checkRange(ArrayList<Enemy> enemyList) {
        if (enemy != null) {
            double distance = enemy.getLocation().distance(this.position);
            if (distance > range) enemy = null;
        }
        if (enemy == null) {
            int n = enemyList.size();
            for (int i = 0; i < n; i++) {
                double distance = position.distance(enemyList.get(i).getLocation());
                if (distance <= range) {
                    enemy = enemyList.get(i);
                    break;
                }
            }
        }
    }

    public void update(){
        lastAttacked ++;
        if(lastAttacked > attackRate && enemy != null && bullet != null){
            lastAttacked = 0;
            /**
             *
             * TODO: fires a bullet
             */
        }
    }

    public String toString(){
        return "NormalTower(" +
                " pos=" + position.toString() +
                " range=" + range +
                " attackRate=" + attackRate +
                " cost=" + cost;
    }
}
