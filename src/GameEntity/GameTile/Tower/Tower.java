package GameEntity.GameTile.Tower;

import GameEntity.Bullet.BulletManager;

import GameEntity.Enemy.Enemy;
import GameEntity.Enemy.EnemyManager;
import GameEntity.GameObject;
import Program.Position;

import java.util.ArrayList;

public abstract class Tower extends GameObject{
    protected int range;
    protected Enemy target;

    protected int attackRate;//attackRate time giữa 2 lần bắn
    protected int lastAttacked;//time kể từ lần bắn trc

    public Tower(int height, int width, Position pos, int range, int attackRate){
        this.height = height;
        this.width = width;
        this.position = pos;
        this.range = range;
        this.attackRate = attackRate;
        this.lastAttacked = 0;
    }

    public int getAttackRate() {
        return attackRate;
    }

    public Enemy getTarget() {
        return target;
    }

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

    public void doDestroy() {
        TowerManager.removeTower(this);
    }

    //update lastAttacked, update target and fire a bullet
    public void update(){
        //update lastAttacked
        lastAttacked ++;

        //update target
        checkRange(EnemyManager.listEnemy);

        //fire a bullet
        if(lastAttacked > attackRate && target != null){
            lastAttacked = 0;
            if(this instanceof NormalTower){
                BulletManager.addBullet("NormalBullet", target, this);
            }
            if(this instanceof SmallerTower){
                BulletManager.addBullet("MachineGunBullet", target, this);
            }
            if(this instanceof SniperTower){
                BulletManager.addBullet("NormalBullet", target, this);
            }
        }
    }

    @Override
    public String toString() {
        return "Tower{" +
                "range=" + range +
                ", attackRate=" + attackRate +
                ", target=" + target +
                ", lastAttacked=" + lastAttacked +
                '}';
    }
}