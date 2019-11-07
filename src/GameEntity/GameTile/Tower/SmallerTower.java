package GameEntity.GameTile.Tower;

import Program.Position;

public class SmallerTower extends Tower implements TowerProperty{
    public SmallerTower(Position pos) {
        super( SMALLER_TOWER_HEIGHT, SMALLER_TOWER_WIDTH, pos, SMALLER_TOWER_RANGE, SMALLER_TOWER_ATTACKRATE);
    }
}
