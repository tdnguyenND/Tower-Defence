package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import Program.Position;

public abstract class Bullet extends GameObject {
    protected double speed;
    protected double damage;
    protected double range;
    protected double xPos;
    protected double yPos;
    protected double[][] direction;

    public Bullet(){
    }

    public Bullet(double speed, double damage, double range,
                  double width, double height, double xPos,
                  double yPos) {
        super(width, height);
        this.speed = speed;
        this.damage = damage;
        this.range = range;
        this.xPos = xPos;
        this.yPos = yPos;
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
        this.position.setX(xPos);
        this.position.setY(yPos);
    }

    @Override
    public Position getLocation() {
        return super.getLocation();
    }

    public void updateDirection(){
        /*
        TODO: - change direction based on enemy's pos
        */

    }

    public void update(Enemy enemy, Bullet bullet){
        /*
        TODO: - initialize new bullet's direction if present bullet hits enemy
              - destroy present bullet
        */
        if(bullet.getLocation().equals(enemy.getLocation())){
            bullet.doDestroy();
            bullet.updateDirection();
        }
    }

     /*
    public void doDamage(Enemy enemy, Bullet bullet){
        if(bullet.getLocation().equals(enemy.getLocation())) enemy.beAttacked(damage);
    }
    */

    @Override
    public String toString() {
        return "Bullet{" +
                "speed=" + speed +
                ", damage=" + damage +
                ", range=" + range +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                ", direction=" + direction +
                ", position=" + position +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}

