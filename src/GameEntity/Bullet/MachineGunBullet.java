package GameEntity.Bullet;

import GameEntity.Enemy.BulletProperty;

public class MachineGunBullet extends Bullet implements BulletProperty {

	public MachineGunBullet(){
		super(MACGUN_BULLET_SPEED, MACGUN_BULLET_DAMAGE,
			  MACGUN_BULLET_RANGE, MACGUN_BULLET_HEIGHT,
			  MACGUN_BULLET_WIDTH);
	}
}
