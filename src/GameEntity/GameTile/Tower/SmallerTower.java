package GameEntity.GameTile.Tower;

import GameEntity.Bullet.Bullet;
import GameEntity.Bullet.MachineGunBullet;
import GameEntity.Bullet.NormalBullet;
import GameEntity.Enemy.Enemy;
import Program.Position;

import java.util.ArrayList;

public class SmallerTower extends Tower implements TowerProperty{

    public SmallerTower(Position pos) {
        super(pos, SMALLER_TOWER_RANGE, SMALLER_TOWER_ATTACKRATE, NORMAL_TOWER_DAMAGE, SMALLER_TOWER_COST);
    }
}
