package GameEntity.GameTile.Tower;

import GameEntity.Bullet.Bullet;
import GameEntity.Bullet.NormalBullet;
import GameEntity.Enemy.Enemy;
import Program.Position;

import java.util.ArrayList;

public class NormalTower extends Tower implements TowerProperty{
    public NormalTower(Position pos) {
        super(pos, NORMAL_TOWER_RANGE, NORMAL_TOWER_ATTACKRATE, NORMAL_TOWER_DAMAGE, NORMAL_TOWER_COST);
    }
}
