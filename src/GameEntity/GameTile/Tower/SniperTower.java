package GameEntity.GameTile.Tower;

import Program.Position;

public class SniperTower extends Tower implements TowerProperty{
    public SniperTower(Position pos) {
        super(pos, SNIPER_TOWER_RANGE, SNIPER_TOWER_ATTACKRATE);
    }
}
