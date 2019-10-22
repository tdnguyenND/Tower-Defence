package GameEntity.GameTile.Tower;

import GameEntity.Bullet.Bullet;
import GameEntity.Bullet.SnipperBullet;
import GameEntity.Enemy.Enemy;
import Program.Position;

import java.util.ArrayList;

public class SnipperTower extends Tower implements TowerProperty{
    public SnipperTower(Position pos) {
        super(pos, SNIPPER_TOWER_RANGE);
    }

    void fire(ArrayList<Enemy> enemyList){
        if(point){
            Position x = fireAble(enemyList).getLocation();
            Bullet bullet = new SnipperBullet();
            //to do...
        }
    }
}
