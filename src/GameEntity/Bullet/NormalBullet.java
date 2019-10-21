package GameEntity.Bullet;

public class NormalBullet extends Bullet implements BulletProperty {

	public NormalBullet(){
		super(NORMAL_BULLET_SPEED, NORMAL_BULLET_DAMAGE,
			  NORMAL_BULLET_RANGE, NORMAL_BULLET_HEIGHT,
			  NORMAL_BULLET_WIDTH);
	}
}