package GameEntity.GameTile.Tower;

import GameEntity.Bullet.Bullet;
import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import Program.Position;

import java.util.ArrayList;

public abstract class Tower extends GameObject {
    protected double range, attackRate;//attackRate time giữa 2 lần bắn
    protected int damage;
    protected int cost;
    protected Bullet bullet;

    protected Enemy target;
    protected double lastAttacked;//time kể từ lần bắn trc

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

    public Enemy getTarget() { return target; }

    public void checkRange(ArrayList<Enemy> enemyList) {
        if (target != null) {
            double distance = target.getLocation().distance(this.position);
            if (distance > range) target = null;
        }
        if (target == null) {
            int n = enemyList.size();
            for (int i = 0; i < n; i++) {
                double distance = position.distance(enemyList.get(i).getLocation());
                if (distance <= range) {
                    target = enemyList.get(i);
                    break;
                }
            }
        }
    }

    public void update(){
        lastAttacked ++;
        if(lastAttacked > attackRate && target != null && bullet != null){
            lastAttacked = 0;
            /**
             *
             * TODO: fires a bullet
             */
        }
    }

    @Override
    public String toString() {
        return "Tower{" +
                "range=" + range +
                ", attackRate=" + attackRate +
                ", damage=" + damage +
                ", cost=" + cost +
                ", bullet=" + bullet +
                ", target=" + target +
                ", lastAttacked=" + lastAttacked +
                '}';
    }
}
