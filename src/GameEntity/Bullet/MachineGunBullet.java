package GameEntity.Bullet;

import GameEntity.GameObject;

public class MachineGunBullet extends Bullet implements BulletProperty {

	public MachineGunBullet(double width, double height, double speed, double damage,
							double range, double xStart, double yStart, double xDest,
							double yDest, double xPos, double yPos){
		super(MACHINEGUN_BULLET_SPEED, MACHINEGUN_BULLET_DAMAGE,
			  MACHINEGUN_BULLET_RANGE, MACHINEGUN_BULLET_HEIGHT,
			  MACHINEGUN_BULLET_WIDTH, xStart, yStart, xDest, yDest,
			  xPos, yPos);
	}

	@Override
	public void calculateVector(double xDest, double yDest) {
		double radian = Math.atan2(xDest - xStart, yDest - yStart);
		this.dx = Math.sin(radian) * MACHINEGUN_BULLET_SPEED;
		this.dy = - Math.cos(radian) * MACHINEGUN_BULLET_SPEED;
	}

	@Override
	public void move(){
		xPos += dx;
		yPos += dy;
		GameObject.setLocation(xPos, yPos);
	}
}
