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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.awt.*;

public class InputManager{
    protected Map map;

    protected static boolean chooseTypeTower = false;
    protected static String towerType;

    protected static boolean sellTower = false;
    protected static boolean x2Speed = false;

    private static boolean upgrade = false;



    public InputManager(){

    }
    public InputManager(Map map){
        this.map = map;
    }

    public void MouseHandling(MouseEvent mouseEvent) {
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();

        int i = (int) Math.ceil(x * 1.0 / Config.GRID_WIDTH);
        int j = (int) Math.ceil(y * 1.0 / Config.GRID_HEIGHT);

        if(! map.map[j - 1][i -1].isFilled()){
            buyTower(i, j);
        }
        else{
            if(sellTower)
                sellTower(i , j);
            else if(upgrade){
                /**
                 *  -TODO
                 *   upgrade tower;
                 */
            }
        }
    }

    private void sellTower(int i, int j) {
            sellTower = false;
            TowerManager.removeTower(map.map[j - 1][i -1]);
    }

    public void buyTower(int i, int j){
        if(chooseTypeTower){
            chooseTypeTower = false;
            TowerManager.createTower(towerType, map.map[j - 1][i -1]);
        }
    }


    public void chooseTypeTower(Event event){
        String id = ((ImageView)event.getSource()).getId();
        towerType = id;
        chooseTypeTower = !chooseTypeTower;
    }

    public void wantToSellTower(MouseEvent mouseEvent) {
        sellTower = !sellTower;
    }

    public void doubleSpeed(MouseEvent mouseEvent){
        if(x2Speed){
            x2Speed = !x2Speed;
            Controller.SPEED = Controller.SPEED / 2;
            System.out.println("/2");
        }
        else{
            x2Speed = !x2Speed;
            Controller.SPEED = Controller.SPEED * 2;
            System.out.println("*2");
        }

    }
}
