package GameEntity.GameTile.Tower;

import GameEntity.Bullet.Bullet;
import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import Program.Position;

import java.util.ArrayList;

public abstract class Tower extends GameObject{
    protected int range, attackRate;//attackRate time giữa 2 lần bắn
    protected Bullet bullet;

    protected Enemy target;
    protected int lastAttacked;//time kể từ lần bắn trc
    protected TowerManager towerManager;

    public Tower(Position pos, int range, int attackRate){
        this.position = pos;
        this.range = range;
        this.attackRate = attackRate;
        this.lastAttacked = 0;
    }

    public int getAttackRate() {
        return attackRate;
    }

    public Enemy getTarget() { return target; }

    public void setTarget(Enemy target) {
        this.target = target;
    }

    public void checkRange(ArrayList<Enemy> enemyList) {
        if (target != null) {
            double distance = target.getLocation().distance(this.position);
            if (distance > range) target = null;
        }
        if (target == null) {
            for (Enemy enemy: enemyList) {
                double distance = position.distance(enemy.getLocation());
                if (distance <= range) {
                    target = enemy;
                    break;
                }
            }
        }
    }

    public void doDestroy(TowerManager towerManager) {
        towerManager.removeTower(position);
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
                ", bullet=" + bullet +
                ", target=" + target +
                ", lastAttacked=" + lastAttacked +
                '}';
    }
}
