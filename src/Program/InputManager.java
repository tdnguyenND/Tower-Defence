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
    protected Map map;

    protected static boolean chooseTower = false;
    protected static String towerType;

    public InputManager(){

    }
    public InputManager(Map map){
        this.map = map;
    }

    public void MouseHandling(MouseEvent mouseEvent) {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            if(chooseTower){
                chooseTower = false;
                int i = (int) Math.ceil(x * 1.0 / Config.GRID_WIDTH);
                int j = (int) Math.ceil(y * 1.0 / Config.GRID_HEIGHT);

                TowerManager.createTower(towerType, map.map[j - 1][i -1]);
                //System.out.println("dat " + towerType + " Thap tai " + x + " " + y);
            }
            else{
                //System.out.println("khong dat duoc thap " + x + " " + y);
            }


    }

    public void chooseTower(Event event){
        String id = ((Control)event.getSource()).getId();
        towerType = id;
        chooseTower = !chooseTower;
    }


}
