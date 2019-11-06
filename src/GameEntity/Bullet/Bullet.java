package GameEntity.Bullet;

import Debugger.Log;
import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import GameEntity.GameTile.Tower.Tower;
import Program.Position;

public abstract class Bullet extends GameObject {
    protected double speed;
    protected double damage;
    protected double range;
    protected Enemy target;
    protected Tower tower;
    protected double dx;
    protected double dy;

    public Bullet(Enemy target, Tower tower){
        this.target = target;
        this.tower = tower;
    }

    public Bullet(double width, double height, double speed, double damage,
                  double range, Enemy target, Tower tower) {
        super(width, height);
        this.speed = speed;
        this.damage = damage;
        this.range = range;
        this.target = target;
        this.tower = tower;
        calculateVector(target);
    }

    @Override
    public void doDestroy() {
        BulletManager.deleteBullet(this);
    }

    public Position getLocation() {
        return super.getLocation();
    }

    public void calculateVector(Enemy target) {
        double radian = Math.atan2(target.getLocation().getX() - tower.getLocation().getX(),
                                   target.getLocation().getY() - tower.getLocation().getY());
        this.dx = Math.sin(radian) * speed;
        this.dy = - Math.cos(radian) * speed;
    }

    public void move(){
        if (!isHit()) updatePos();
        doDamage();
        doDestroy();
    }

    public void updatePos(){
        position.setPosition(position.getX() + (int)dx, position.getY() + (int)dy);
    }

    public boolean isHit(){
        if(position.distance(target.getLocation()) <= 8) {
            return true;
        }
        return false;
    }

    public void doDamage(){
        if(isHit()) {
            target.beAttacked(damage);
        }
    }


    @Override
    public String toString() {
        return "Bullet{" +
                "speed=" + speed +
                ", damage=" + damage +
                ", range=" + range +
                ", dx=" + dx +
                ", dy=" + dy +
                ", position=" + position +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}

