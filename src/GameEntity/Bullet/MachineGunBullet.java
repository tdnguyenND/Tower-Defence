package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameTile.Tower.Tower;

public class MachineGunBullet extends Bullet implements BulletProperty {

	public MachineGunBullet(Enemy target, Tower tower) {
		super(MACHINE_GUN_BULLET_WIDTH, MACHINE_GUN_BULLET_HEIGHT,
				MACHINE_GUN_BULLET_SPEED, MACHINE_GUN_BULLET_DAMAGE,
				target, tower);
	}
}
