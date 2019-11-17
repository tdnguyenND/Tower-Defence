package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameTile.Tower.Tower;

public class SniperBullet extends Bullet implements BulletProperty {
	public SniperBullet(Enemy target, Tower tower){
		super(SNIPER_BULLET_WIDTH, SNIPER_BULLET_HEIGHT,
				SNIPER_BULLET_SPEED, SNIPER_BULLET_DAMAGE,
				target, tower);
		this.damage += (tower.getLevel() - 1) * BulletProperty.SNIPER_BULLET_DMG_ADDITION;
	}
}