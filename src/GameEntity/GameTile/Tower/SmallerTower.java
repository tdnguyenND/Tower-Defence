package GameEntity.GameTile.Tower;

import Map.Grid;
import javafx.scene.image.Image;

import java.io.File;

public class SmallerTower extends Tower implements TowerProperty{
    public SmallerTower(Grid pos) {
        super( SMALLER_TOWER_HEIGHT, SMALLER_TOWER_WIDTH, pos, SMALLER_TOWER_RANGE, SMALLER_TOWER_ATTACK_RATE);

        File file = new File("src/data/image/smaller-tower-02.png");
        String localURL = file.toURI().toString();
        image = new Image(localURL);
    }
}
