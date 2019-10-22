package GameEntity.GameTile.Tower;

import GameEntity.Bullet.Bullet;
import GameEntity.Bullet.MachineGunBullet;
import GameEntity.Bullet.NormalBullet;
import GameEntity.Enemy.Enemy;
import Program.Position;

import java.util.ArrayList;

public class SmallerTower extends Tower implements TowerProperty{

    public SmallerTower(Position pos) {
        super(pos, SMALLER_TOWER_RANGE);
    }

    void fire(ArrayList<Enemy> enemyList){
        if(point){
            Position x = fireAble(enemyList).getLocation();
            Bullet bullet = new MachineGunBullet();
            //to do...
        }
    }
}
