package Program;

import GameEntity.GameTile.Tower.InfernoTower;
import GameEntity.GameTile.Tower.Tower;
import GameEntity.GameTile.Tower.TowerManager;
import Map.*;
import Music.MusicManager;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class InputManager{
    protected static Map map;

    protected static boolean chooseTypeTower = false;
    protected static String towerType;
    public static Grid selected;

    protected static boolean sellTower = false;

    protected static boolean x2Speed = false;

    private static boolean upgrade = false;

    public InputManager(){

    }
    public static void setMap(Map map){
        InputManager.map = map;
    }

    public static void MouseHandling(MouseEvent mouseEvent) {
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();

        int i = (int) Math.ceil(x * 1.0 / Config.GRID_WIDTH);
        int j = (int) Math.ceil(y * 1.0 / Config.GRID_HEIGHT);

        selected = map.map[j - 1][i - 1];

        if(!selected.isFilled()){
            buyTower(i, j);
        }
        else{
            if(sellTower){
                sellTower(i , j);
                selected = null;
            }
            else if(upgrade){
                /**
                 *  -TODO
                 *   upgrade tower;
                 */
                if (map.map[i][j].getContain() instanceof Tower){
                    ((Tower)map.map[i][j].getContain()).upgrade();
                }
                selected = null;
            }
        }
    }

    public static void chooseTypeTower(MouseEvent event) {
        towerType = ((Button)event.getSource()).getId();
        chooseTypeTower = true;
    }

    public static void buyTower(int i, int j){
        if(chooseTypeTower){
            chooseTypeTower = false;
            TowerManager.createTower(towerType, map.map[j - 1][i -1]);
        }
        removeSelected();
    }

    public static void wantToSellTower(MouseEvent mouseEvent) {
        sellTower = !sellTower;
    }

    private static void sellTower(int i, int j) {
        sellTower = false;
        TowerManager.removeTower(map.map[j - 1][i -1]);
        selected.setContain(null);
        selected.setFilled(false);
    }

    public static void doubleSpeed(MouseEvent mouseEvent){
        if(x2Speed){
            x2Speed = false;
            GameManager.updateLoop = GameManager.updateLoop * 2;
        }
        else{
            x2Speed = true;
            GameManager.updateLoop = GameManager.updateLoop / 2;
        }
    }

    public static void upgrade(MouseEvent mouseEvent){
        if (selected!= null && selected.getContain() != null && selected.getContain() instanceof Tower){
            ((Tower)selected.getContain()).upgrade();
        }
    }

    public static void switchType(MouseEvent mouseEvent){
        if (selected != null && selected.getContain() != null && selected.getContain() instanceof InfernoTower){
            ((InfernoTower)selected.getContain()).switchType();
        }
    }

    public static void switchMusic(MouseEvent mouseEvent){
        MusicManager.switchVersion();
    }

    public static void removeSelected(){
        selected = null;
    }
}
