package GameEntity.Enemy;

import GameEntity.GameObject;
import Program.Player;
import Program.Config;
import Program.Position;

public abstract class Enemy extends GameObject {
    protected double health;
    protected double armor;
    protected double speed;
    protected double damage;

    public int reward;

    public Enemy(){

    }

    public Enemy(double health, double armor,
                 double speed, double damage,
                 double width, double height,
                 int reward) {
        this.health = health;
        this.armor = armor;
        this.speed = speed;
        this.damage = damage;
        this.position = Config.startPoint;
        this.width = width;
        this.height = height;
        this.reward = reward;
        this.color = "";
    }

    public void init(){
        /**
         * TODO:
         */
    };

    public void setLocation(Position pos){
        /**
         * TODO:
         */
    };

    public void doDestroy(){
        /**
         * TODO:
         */
    }

    public void doDamage(Player player){
        player.beAttacked(this.damage);
        this.doDestroy();
    }

    public void beAttacked(final double damage){
        this.health -= damage*(50.0/(50+ this.armor));
    }

    public void move(int vX, int vY){
        /**
         * vector(vX, vY) is the current direction of this crep
         */
        this.position.setPosition(vX * this.speed * 1.0/Config.GAME_FPS, vY * this.speed * 1.0/Config.GAME_FPS);
    }

    public void onUpdate(int x, int y){
        if (health <= 0) doDestroy();
        else move(x, y);
    }
}