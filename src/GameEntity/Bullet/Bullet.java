package GameEntity.Bullet;

import GameEntity.GameObject;

public abstract class Bullet extends GameObject {
    protected double speed;
    protected double damage;
    protected double range;

    public Bullet(){
    }

    public Bullet(double speed, double damage, double range,
    			  double width, double height) {
        super(width, height);
    	this.speed = speed;
    	this.damage = damage;
    	this.range = range;
    }


    
}
