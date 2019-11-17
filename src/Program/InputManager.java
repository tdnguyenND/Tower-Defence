package Program;

import GameEntity.GameTile.Tower.TowerManager;
import Map.Map;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class InputManager{
    protected static Map map;

    protected static boolean chooseTower = false;
    protected static String towerType;

    public InputManager(){

    }
    public static void setMap(Map map){
        InputManager.map = map;
    }

    public static void MouseHandling(MouseEvent mouseEvent) {
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();
        if(chooseTower){
            chooseTower = false;
            int i = (int) Math.ceil(x * 1.0 / Config.GRID_WIDTH);
            int j = (int) Math.ceil(y * 1.0 / Config.GRID_HEIGHT);

            TowerManager.createTower(towerType, map.map[j - 1][i -1]);
        }
    }

    public void chooseTower(Event event){
        String id = ((Control)event.getSource()).getId();
        towerType = id;
        chooseTower = !chooseTower;
    }
}
