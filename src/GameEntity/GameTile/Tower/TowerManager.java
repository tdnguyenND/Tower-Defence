package GameEntity.GameTile.Tower;

import GameEntity.GameObject;
import Program.GameField;
import Program.GameManager;
import Program.Player;
import Program.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TowerManager implements TowerProperty{
    protected Set<Tower> towerList;
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

        Iterator iterator = towerList.iterator();
        while(iterator.hasNext()){
            Tower tower = (Tower) iterator.next();
            if(tower.getLocation() == position) ableToSetTower = false;
        }

        if(ableToSetTower){
            Tower tower;
            if(towerType.equals("NormalTower")){
                if(player.getGold() >= NORMAL_TOWER_COST){
                    tower = new NormalTower(position);
                    towerList.add(tower);
                    /**
                     *  setGold??
                     */
                }
            }
            if(towerType.equals("SmallerTower")){
                if(player.getGold() >= SMALLER_TOWER_COST){
                    tower = new SmallerTower(position);
                    towerList.add(tower);
                    /**
                     *  setGold??
                     */
                }
            }
            if(towerType.equals("SniperTower")){
                if(player.getGold() >= SNIPER_TOWER_COST){
                    tower = new SniperTower(position);
                    towerList.add(tower);
                    /**
                     *  setGold??
                     */
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

    public void update(){
        for (Tower tower : towerList){
            /**
             * todo
             *  GameManager has EnemyManager
             */
            //tower.checkRange();
        }
    }
}
