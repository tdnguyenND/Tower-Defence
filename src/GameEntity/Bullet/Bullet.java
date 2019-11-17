package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import GameEntity.GameTile.Tower.Tower;
import Program.Position;

public abstract class Bullet extends GameObject {
    protected double speed;
    protected double damage;
    public Enemy target;
    protected Tower tower;
    protected double dx;
    protected double dy;

    protected boolean destroy;

    public Bullet(){
    }

    public Bullet(Enemy target, Tower tower){
        this.target = target;
        this.tower = tower;
    }

    public Bullet(double width, double height, double speed, double damage,
                  Enemy target, Tower tower) {
        super(width, height);
        this.speed = speed;
        this.damage = damage;
        this.target = target;
        this.tower = tower;
        this.position = tower.getLocation().clone();
        calculateVector();
        destroy = false;
    }

    @Override
    public void doDestroy() {
        destroy = true;
    }

    public Position getLocation() {
        return super.getLocation();
    }

    public void calculateVector() {
        double radian = Math.atan2(target.getLocation().getX() - position.getX(),
                                   target.getLocation().getY() - position.getY());
        this.dx = Math.sin(radian) * speed;
        this.dy = Math.cos(radian) * speed;
    }

    public void move(){
        position.setX(position.getX() + (int)dx);
        position.setY(position.getY() + (int)dy);
    }

    public boolean isHit(){
        return (position.distance(target.getLocation()) <= target.getWidth());
    }

    public void doDamage(){
            target.beAttacked(damage);
    }

    public void update(){
        /**
         * TODO: - move
         *       - check isHit -> do dmg, doDes
         *       - check out of range -> do destroy
         */
        calculateVector();
        move();
        if(isHit()){
            setLocation(target.getLocation());
            doDamage();
            doDestroy();
        }
        else if(position.distance(tower.getLocation()) > tower.getRange())
            doDestroy();
    }

    public boolean isDestroy() {
        return destroy;
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "speed=" + speed +
                ", damage=" + damage +
                ", dx=" + dx +
                ", dy=" + dy +
                ", position=" + position +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}

