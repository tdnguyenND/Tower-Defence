package GameEntity.GameTile.Tower;

import Program.Position;

public class NormalTower extends Tower implements TowerProperty{
    public NormalTower(Position pos) {
        super(NORMAL_TOWER_HEIGHT, NORMAL_TOWER_WIDTH, pos, NORMAL_TOWER_RANGE, NORMAL_TOWER_ATTACKRATE);
    }
}
