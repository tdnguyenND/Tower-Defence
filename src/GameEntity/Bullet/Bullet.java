package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import Program.Position;

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

    @Override
    public void init() {
        /*
        TODO:
        */
    }

    @Override
    public void doDestroy() {
        /*
        TODO:
        */
    }

    @Override
    public void setLocation(Position pos) {
        /*
        TODO:
        */
    }

    @Override
    public Position getLocation() {
        return super.getLocation();
    }

    public void doDamage(Enemy enemy, Bullet bullet){
        if(bullet.getLocation() == enemy.getLocation()) enemy.beAttacked();
        this.doDestroy();
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "speed=" + speed +
                ", damage=" + damage +
                ", range=" + range +
                ", position=" + position +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

}

