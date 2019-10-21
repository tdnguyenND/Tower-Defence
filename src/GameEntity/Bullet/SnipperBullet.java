package GameEntity.Bullet;

public class SnipperBullet extends Bullet implements BulletProperty{

	public SnipperBullet(){
		super(SNIPER_BULLET_SPEED, SNIPER_BULLET_DAMAGE,
			  SNIPER_BULLET_RANGE, SNIPER_BULLET_HEIGHT,
			  SNIPER_BULLET_WIDTH);
	}
}

