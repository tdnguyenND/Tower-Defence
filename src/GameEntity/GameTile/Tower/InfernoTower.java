package GameEntity.GameTile.Tower;

import GameEntity.Bullet.BulletManager;
import GameEntity.Enemy.Enemy;
import GameEntity.Enemy.EnemyManager;
import Map.Grid;
import javafx.scene.image.Image;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class InfernoTower extends Tower{

    private int type;
    private int maxTarget;
    private int currentAttackDuplicate;

    private Set<Enemy> listTarget;



    public InfernoTower(Grid pos) {
        super(TowerProperty.INFERNO_TOWER_HEIGHT, TowerProperty.INFERNO_TOWER_WIDTH, pos,
                TowerProperty.INFERNO_TYPE1_RANGE, TowerProperty.INFERNO_ATTACK_RATE);
        maxTarget = TowerProperty.INFERNO_TOWER_MAX_TARGET;
        type = 1;
        listTarget = new HashSet<>();
        currentAttackDuplicate = 0;
        switchType();

        File file = new File("src/data/image/inferno-tower-02.png");
        String localURL = file.toURI().toString();
        image = new Image(localURL);
    }

    public int getCurrentAttackDuplicate() {
        return currentAttackDuplicate;
    }

    public int getType() {
        return type;
    }

    public void switchType(){
        if (type == 1) {
            type = 2;
            listTarget.clear();
            target = null;
        }
        else {
            type = 1;
            currentAttackDuplicate = 0;
        }
    }

    public void type1CheckRange(long currentTick){
        if (target != null) {
            if (target.isDestroy()) target = null;
            else{
                if (currentTick - previousTick > TowerProperty.updatingCycle){
                    currentAttackDuplicate += (currentTick - previousTick)/TowerProperty.updatingCycle;
                    previousTick = currentTick;
                }
                double distance = target.getLocation().distance(this.position);
                if (distance > range) target = null;
            }
        }
        if (target == null) {
            currentAttackDuplicate = 0;
            for (Enemy enemy: EnemyManager.listEnemy) {
                double distance = position.distance(enemy.getLocation());
                if (distance <= range) {
                    target = enemy;
                    break;
                }
            }
        }
    }

    public void type2CheckRange(){
        listTarget.removeIf(Enemy::isDestroy);
        listTarget.removeIf(target -> ( target.getLocation().distance(this.position) > range));
        if (listTarget.size() < maxTarget){
            for (Enemy enemy: EnemyManager.listEnemy){
                double distance = position.distance(enemy.getLocation());
                if (distance <= range) {
                    listTarget.add(enemy);
                    if (listTarget.size() == maxTarget) break;
                }
            }
        }
    }

    @Override
    public void checkRange() {
    }

    public void type2Update(long currentTick){

        type2CheckRange();

        for(Enemy enemy:listTarget){
            BulletManager.addBullet("InfernoBullet", enemy, this);
        }
        lastAttacked = 0;
    }

    public void type1Update(long currentTick){
        type1CheckRange(currentTick);
        if (target != null)
            BulletManager.addBullet("InfernoBullet", target, this);
    }

    @Override
    public void update(long currentTick) {
        if (type == 1) type1Update(currentTick);
        else type2Update(currentTick);
    }
}
