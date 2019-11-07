package GameEntity.GameTile.Tower;

import Program.Position;

public class SniperTower extends Tower implements TowerProperty{
    public SniperTower(Position pos) {
        super( SNIPER_TOWER_HEIGHT, SNIPER_TOWER_WIDTH, pos, SNIPER_TOWER_RANGE, SNIPER_TOWER_ATTACKRATE);
    }
}
