package GameEntity.GameTile.Tower;

import Program.Position;

public class SmallerTower extends Tower implements TowerProperty{

    public SmallerTower(Position pos) {
        super(pos, SMALLER_TOWER_RANGE, SMALLER_TOWER_ATTACKRATE, NORMAL_TOWER_DAMAGE, SMALLER_TOWER_COST);
    }
}
