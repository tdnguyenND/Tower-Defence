package GameEntity.GameTile.Tower;

import GameEntity.Bullet.Bullet;
import GameEntity.Bullet.SnipperBullet;
import GameEntity.Enemy.Enemy;
import Program.Position;

import java.util.ArrayList;

public class SniperTower extends Tower implements TowerProperty{
    public SniperTower(Position pos) {
        super(pos, SNIPER_TOWER_RANGE, SNIPER_TOWER_ATTACKRATE, SNIPER_TOWER_DAMAGE, SNIPER_TOWER_COST);
    }
}
