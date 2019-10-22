package GameEntity.GameTile.Tower;

import GameEntity.Bullet.Bullet;
import GameEntity.Bullet.NormalBullet;
import GameEntity.Enemy.Enemy;
import Program.Position;

import java.util.ArrayList;

public class NormalTower extends Tower implements TowerProperty{
    public NormalTower(Position pos) {
        super(pos, NOMAL_TOWER_RANGE);
    }

    void fire(ArrayList<Enemy> enemyList){
        if(point){
            Position x = fireAble(enemyList).getLocation();
            Bullet bullet = new NormalBullet();
            //to do...
        }
    }
}
