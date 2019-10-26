package GameEntity.Enemy;

import GameEntity.GameObject;
import Program.Player;
import Map.*;

public abstract class Enemy extends GameObject {
    protected double health;
    protected double armor;
    protected double speed;

    public int reward;

    private Map map;

    private Grid locationInMap;

    private int currentIndex;

    private int[] direction;

    private Player player;

    public Enemy(){

    }

    public Enemy(double health, double armor,
                 double speed, double width,
                 double height, int reward) {
        super(width, height);
        this.health = health;
        this.armor = armor;
        this.speed = speed;
        this.reward = reward;
        this.color = "";
        this.locationInMap = null;
        this.position = null;
        this.currentIndex = 0;
        this.map = null;
        this.player = null;
    }

    public void init(Map map, Player player){
        /**
         * TODO:
         *  - Load image ....
         */
        try{
            if (map == null) throw new Exception("Map is null");
            this.map = map;
            this.locationInMap = map.map[Line.startPoint[0]][Line.startPoint[1]];
            this.position = locationInMap.getCenter();
            updateDirection();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            if (player == null) throw new Exception("Player is null");
            this.player = player;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    };

    public void updateDirection(){
        int inCol = Line.line[currentIndex + 1][0] - Line.line[currentIndex][0];
        if (inCol > 0){
            direction = Line.direction[0];
        }
        else if (inCol < 0){
            direction = Line.direction[1];
        }
        else {
            int inRow = Line.line[currentIndex + 1][1] - Line.line[currentIndex][1];
            if (inRow > 0){
                direction = Line.direction[2];
            }
            else direction = Line.direction[3];
        }
    }

    public void update(){

        /**
         * TODO:
         *  - Check if this enemy's health is over
         *  - Check if this enemy go to turf
         *  - DO NOT check if this enemy be shoot -> it's from Bullet
         */
        if (health <= 0){
            /**
             * TODO:
             *  - Do destroy
             */
            doDestroy();
        }
        else if (position.equals(map.map[Line.line[currentIndex][0]][Line.line[currentIndex][1]].getCenter())){
            currentIndex++;
            if (currentIndex >= Line.size){
                /**
                 * TODO:
                 *  -do damage
                 *  -do destroy
                 */
                doDamage(this.player);
            }
            else {
                updateDirection();
                move();
            }
        }
        else move();
    }

    public void move(){
        setLocation(this.position.getX() + speed*direction[0], this.position.getY() + speed * direction[1]);
    }

    public void setLocation(double x, double y){
        /**
         * TODO:
         *  -reload new location
         */
        this.position.setX(x);
        this.position.setY(y);
    };

    public void doDestroy(){
        /**
         * TODO:
         */
    }

    public void doDamage(Player player){
        player.beAttacked();
        this.doDestroy();
    }

    public void beAttacked(final double damage){
        this.health -= damage*(50.0/(50+ this.armor));
    }
}