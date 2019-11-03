package GameEntity.Bullet;

import GameEntity.GameObject;

public class NormalBullet extends Bullet implements BulletProperty {
	public NormalBullet(double width, double height, double speed, double damage,
						double range, double xStart, double yStart, double xDest,
						double yDest, double xPos, double yPos) {
		super(NORMAL_BULLET_WIDTH, NORMAL_BULLET_HEIGHT,
			  NORMAL_BULLET_SPEED, NORMAL_BULLET_DAMAGE,
			  NORMAL_BULLET_RANGE, xStart, yStart, xDest,
			  yDest, xPos, yPos);
	}

	@Override
	public void calculateVector(double xDest, double yDest) {
		double radian = Math.atan2(xDest - xStart, yDest - yStart);
		this.dx = Math.sin(radian) * NORMAL_BULLET_SPEED;
		this.dy = - Math.cos(radian) * NORMAL_BULLET_SPEED;
	}

	@Override
	public void move(){
		xPos += dx;
		yPos += dy;
		GameObject.setLocation(xPos, yPos);
	}
}
