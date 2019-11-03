package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import Program.Position;

public abstract class Bullet extends GameObject {
    protected double speed;
    protected double damage;
    protected double range;
    protected double xStart = 0;
    protected double yStart = 0;
    protected double xDest = 0;
    protected double yDest = 0;
    protected double dx;
    protected double dy;
    protected double xPos;
    protected double yPos;

    public Bullet(){
    }

    public Bullet(double width, double height, double speed, double damage,
                  double range, double xStart, double yStart, double xDest,
                  double yDest, double xPos, double yPos) {
        super(width, height);
        this.speed = speed;
        this.damage = damage;
        this.range = range;
        this.xStart = xStart;
        this.yStart = yStart;
        this.xDest = xDest;
        this.yDest = yDest;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public static boolean init() {
        /*
        TODO:
        */
    }

    @Override
    public void doDestroy() {
        BulletManager.deleteBullet(this);
    }

    @Override
    public Position getLocation() {
        return super.getLocation();
    }

    public abstract void calculateVector(double xDest, double yDest);
    public abstract void move();

    public void update(Enemy enemy, Bullet bullet){
        /*
        TODO:- destroy present bullet
        */
        if(bullet.getLocation().equals(enemy.getLocation())){
            bullet.doDestroy();
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
                ", xStart=" + xStart +
                ", yStart=" + yStart +
                ", xDest=" + xDest +
                ", yDest=" + yDest +
                ", dx=" + dx +
                ", dy=" + dy +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                ", position=" + position +
                ", width=" + width +
                ", height=" + height +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                ", color='" + color + '\'' +
                '}';
    }
}

