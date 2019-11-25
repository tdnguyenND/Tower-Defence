package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameObject;
import GameEntity.GameTile.Tower.Tower;
import Program.GameManager;
import Program.Position;

public abstract class Bullet extends GameObject {
    protected double speed;
    protected double damage;
    public Enemy target;
    protected Tower tower;
    protected double dx;
    protected double dy;

    private double realX;
    private double realY;

    private long previousTick;
    private int updatingCycle;

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
        realX = position.getX();
        realY = position.getY();
        this.previousTick = GameManager.getPreviousTick();
        this.updatingCycle = (int)(BulletProperty.updateLoop/this.speed);
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
        this.dx = Math.sin(radian);
        this.dy = Math.cos(radian);
    }

    public void move(){
        this.realX += dx;
        this.realY += dy;
        position.setX((int)(realX));
        position.setY((int)(realY));
    }

    public boolean isHit(){
        return (position.equals(target.getLocation()));
    }

    public void doDamage(){
            target.beAttacked(damage);
    }

    public void update(long currentTick){
        /**
         * TODO: - move
         *       - check isHit -> do dmg, doDes
         *       - check out of range -> do destroy
         */
        if (currentTick - previousTick > this.updatingCycle ){
            while (previousTick < currentTick){
                calculateVector();
                move();
                if(isHit()){
                    setLocation(target.getLocation());
                    doDamage();
                    doDestroy();
                }
                else if(position.distance(tower.getLocation()) > tower.getRange())
                    doDestroy();
                previousTick += this.updatingCycle;
            }
            previousTick = currentTick;
        }
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
                ", image='" + image + '\'' +
                '}';
    }
}

