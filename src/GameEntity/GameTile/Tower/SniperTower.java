package GameEntity.GameTile.Tower;

import Map.Grid;
import javafx.scene.image.Image;

import java.io.File;

public class SniperTower extends Tower implements TowerProperty{
    public SniperTower(Grid pos) {
        super( SNIPER_TOWER_HEIGHT, SNIPER_TOWER_WIDTH, pos, SNIPER_TOWER_RANGE, SNIPER_TOWER_ATTACK_RATE);

        File file = new File("src/data/image/macgun-tower-02.png");
        String localURL = file.toURI().toString();
        image = new Image(localURL);
    }
}
