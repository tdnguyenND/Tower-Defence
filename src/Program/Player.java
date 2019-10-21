package Program;

public class Player {
    private double health;
    private Boolean lose;

    public Player(){

    }

    public void update(){
        if (health <= 0) lose = true;
    }

    public void beAttacked(final double damage){
        this.health -= damage;
    }

    public boolean isLose(){
        return this.lose;
    }
}
