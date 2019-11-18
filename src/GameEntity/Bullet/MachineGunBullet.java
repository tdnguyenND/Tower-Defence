package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameTile.Tower.Tower;

public class MachineGunBullet extends Bullet {

	public MachineGunBullet(Enemy target, Tower tower) {
		super(BulletProperty.MACHINE_GUN_BULLET_WIDTH, BulletProperty.MACHINE_GUN_BULLET_HEIGHT,
				BulletProperty.MACHINE_GUN_BULLET_SPEED, BulletProperty.MACHINE_GUN_BULLET_DAMAGE,
				target, tower);
		this.damage += (tower.getLevel() - 1) * BulletProperty.MACHINE_GUN_BULLET_DMG_ADDITION;
	}
}
