package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameTile.Tower.InfernoTower;
import GameEntity.GameTile.Tower.Tower;
import GameEntity.GameTile.Tower.TowerProperty;

public class InfernoBullet extends Bullet{
    public boolean isUsed;

    public InfernoBullet(Enemy target, InfernoTower tower) {
        this.width = BulletProperty.INFERNO_BULLET_WIDTH;
        this.height = BulletProperty.INFERNO_BULLET_HEIGHT;
        this.speed = 0;
        double damage;
        if (tower.getType() == 2){
            damage = BulletProperty.INFERNO_BULLET_TYPE1_DAMAGE;
        }
        else {
            damage = Math.min(BulletProperty.INFERNO_BULLET_TYPE2_MAX_DAMAGE, BulletProperty.INFERNO_BULLET_TYPE2_MIN_DAMAGE + tower.getCurrentAttackDuplicate() * 5);
        }
        this.damage = damage * 1.0/tower.getAttackRate();
        this.target = target;
        this.tower = tower;
        this.position = tower.getLocation().clone();
        calculateVector();
        destroy = false;
        isUsed = false;
    }

    @Override
    public void update() {
        if (isUsed) doDestroy();
        else {
            doDamage();
            isUsed = true;
        }
    }
}
