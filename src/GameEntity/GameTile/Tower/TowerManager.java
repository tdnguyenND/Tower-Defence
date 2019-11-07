package GameEntity.GameTile.Tower;

import Map.*;
import GameEntity.GameObject;
import Program.*;

import java.util.HashSet;
import java.util.Set;

public class TowerManager implements TowerProperty{
    public static Set<Tower> towerList;
    Player player;
    GameManager gameManager;

    public TowerManager(Set<Tower> towerList, Player player) {
        this.towerList = new HashSet<Tower>();
        this.player = player;
    }

    public Set<Tower> getTowerList() {
        return towerList;
    }

    public void setTowerList(Set<Tower> towerList) {
        this.towerList = towerList;
    }

    public void addTower(String towerType, Position position){
        boolean ableToSetTower = true;

        //is this place a Mountain?
        int i = (int)Math.ceil(position.getX() / Config.GRID_WIDTH);    //calculate position to grid
        int j = (int)Math.ceil(position.getY() / Config.GRID_HEIGHT);
        if(!(gameManager.map.map[i][j] instanceof Mountain)) ableToSetTower = false;

        //Does this place have a tower yet?
        for(Tower tower: towerList){
            if(tower.getLocation().equals(position)) ableToSetTower = false;
        }

        if(ableToSetTower){
            Tower tower;
            if(towerType.equals("NormalTower")){
                if(player.getGold() >= NORMAL_TOWER_COST){
                    tower = new NormalTower(position);
                    towerList.add(tower);
                    player.setGold(player.getGold() - NORMAL_TOWER_COST);
                }
            }
            if(towerType.equals("SmallerTower")){
                if(player.getGold() >= SMALLER_TOWER_COST){
                    tower = new SmallerTower(position);
                    towerList.add(tower);
                    player.setGold(player.getGold() - SMALLER_TOWER_ATTACKRATE);
                }
            }
            if(towerType.equals("SniperTower")){
                if(player.getGold() >= SNIPER_TOWER_COST){
                    tower = new SniperTower(position);
                    towerList.add(tower);
                    player.setGold(player.getGold() - SNIPER_TOWER_COST);
                }
            }
        }

    }

    public void removeTower(Position position){
        towerList.remove(position);
    }

    public void reset() {
        towerList.clear();
    }

    public static void update(){
        for (Tower tower : towerList){
            tower.update();
        }
    }
}
