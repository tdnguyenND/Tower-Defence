package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import GameEntity.GameTile.Tower.Tower;

public class SnipperBullet extends Bullet implements BulletProperty {
	public SnipperBullet(Enemy target, Tower tower) {
		super(target, tower);
	}

	public SnipperBullet(double width, double height, double speed, double damage,
						 double range, Enemy target, Tower tower){
		super(SNIPER_BULLET_SPEED, SNIPER_BULLET_DAMAGE,
			  SNIPER_BULLET_RANGE, SNIPER_BULLET_HEIGHT,
			  SNIPER_BULLET_WIDTH, target, tower);
	}
}