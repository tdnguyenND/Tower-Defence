package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import GameEntity.GameTile.Tower.Tower;

public class NormalBullet extends Bullet implements BulletProperty {
	public NormalBullet(Enemy target, Tower tower) {
		super(NORMAL_BULLET_WIDTH, NORMAL_BULLET_HEIGHT,
			  NORMAL_BULLET_SPEED, NORMAL_BULLET_DAMAGE,
			  target, tower);
		this.damage += (tower.getLevel() - 1) * BulletProperty.NORMAL_BULLET_DMG_ADDITION;
	}
}
