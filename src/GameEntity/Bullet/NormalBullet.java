package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameTile.Tower.Tower;

public class NormalBullet extends Bullet {
	public NormalBullet(Enemy target, Tower tower) {
		super(BulletProperty.NORMAL_BULLET_WIDTH, BulletProperty.NORMAL_BULLET_HEIGHT,
                BulletProperty.NORMAL_BULLET_SPEED, BulletProperty.NORMAL_BULLET_DAMAGE,
			  target, tower);
		this.damage += (tower.getLevel() - 1) * BulletProperty.NORMAL_BULLET_DMG_ADDITION;
	}
}
