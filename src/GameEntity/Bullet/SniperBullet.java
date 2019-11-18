package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameTile.Tower.Tower;

public class SniperBullet extends Bullet {
	public SniperBullet(Enemy target, Tower tower){
		super(BulletProperty.SNIPER_BULLET_WIDTH, BulletProperty.SNIPER_BULLET_HEIGHT,
                BulletProperty.SNIPER_BULLET_SPEED, BulletProperty.SNIPER_BULLET_DAMAGE,
				target, tower);
		this.damage += (tower.getLevel() - 1) * BulletProperty.SNIPER_BULLET_DMG_ADDITION;
	}
}