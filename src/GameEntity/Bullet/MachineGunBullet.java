package GameEntity.Bullet;

import GameEntity.Enemy.BulletProperty;

public class MachineGunBullet extends Bullet implements BulletProperty {

	public MachineGunBullet(){
		super(MACHINEGUN_BULLET_SPEED, MACHINEGUN_BULLET_DAMAGE,
			  MACHINEGUN_BULLET_RANGE, MACHINEGUN_BULLET_HEIGHT,
			  MACHINEGUN_BULLET_WIDTH);
	}
}
