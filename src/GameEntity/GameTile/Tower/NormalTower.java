package GameEntity.GameTile.Tower;

import Map.Grid;
import javafx.scene.image.Image;

import java.io.File;

public class NormalTower extends Tower implements TowerProperty{
    public NormalTower(Grid pos) {
        super(NORMAL_TOWER_HEIGHT, NORMAL_TOWER_WIDTH, pos, NORMAL_TOWER_RANGE, NORMAL_TOWER_ATTACK_RATE);

        File file = new File("image/normal-tower-02.png");
        String localURL = file.toURI().toString();
        image = new Image(localURL);
    }
}
