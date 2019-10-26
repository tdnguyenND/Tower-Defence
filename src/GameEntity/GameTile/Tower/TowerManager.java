package GameEntity.GameTile.Tower;

import GameEntity.Enemy.Enemy;
import Program.Position;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class TowerManager {
    Set<Tower> towerList;
    Set<Position> towerMap;
    TowerProperty towerProperty;

    public Set<Tower> getTowerList() {
        return towerList;
    }

    public void addTower(String towerType, Position position, int gold){
        boolean available = true;
        if(!towerMap.contains(position)) available = false;

        Iterator iterator = towerList.iterator();
        while(iterator.hasNext()){
            Tower tower = (Tower) iterator.next();
            if(tower.getLocation() == position) available = false;
        }

        if(available){
            switch (towerType){
                case "NormalTower":
                    if(gold >= towerProperty.NORMAL_TOWER_COST){
                        Tower tower = new NormalTower(position);
                        towerList.add(tower);
                    }
                    break;
                case "SmallerTower":
                    if(gold >= towerProperty.SMALLER_TOWER_COST){
                        Tower tower = new SmallerTower(position);
                        towerList.add(tower);
                    }
                    break;
                case "SniperTower":
                    if(gold >= towerProperty.SNIPER_TOWER_COST){
                        Tower tower = new SniperTower(position);
                        towerList.add(tower);
                    }
                    break;
            }
        }
    }

    public void removeTower(Position position){
        towerList.remove(position);
    }

    public void reset() {
        towerList.clear();
    }

    public void update(){
        /**
         * TODO: update for towerList
         */
    }
}
