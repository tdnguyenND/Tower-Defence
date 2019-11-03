package GameEntity.Bullet;

import GameEntity.GameObject;

public class SnipperBullet extends Bullet implements BulletProperty {

	public SnipperBullet(double width, double height, double speed, double damage,
						 double range, double xStart, double yStart, double xDest,
						 double yDest, double xPos, double yPos){
		super(SNIPER_BULLET_SPEED, SNIPER_BULLET_DAMAGE,
			  SNIPER_BULLET_RANGE, SNIPER_BULLET_HEIGHT,
			  SNIPER_BULLET_WIDTH, xStart, yStart, xDest,
			  yDest, xPos, yPos);
	}

	@Override
	public void calculateVector(double xDest, double yDest) {
		double radian = Math.atan2(xDest - xStart, yDest - yStart);
		this.dx = Math.sin(radian) * SNIPER_BULLET_SPEED;
		this.dy = - Math.cos(radian) * SNIPER_BULLET_SPEED;
	}

	@Override
	public void move(){
		xPos += dx;
		yPos += dy;
		GameObject.setLocation(xPos, yPos);
	}
}