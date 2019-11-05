package Program;

public class Player {
    private double health;
    private Boolean lose;
    private int gold;

    public Player(){
    }

    public void update(){
        if (health <= 0) lose = true;
    }

    public void beAttacked(){
        this.health --;
    }

    public boolean isLose(){
        return this.lose;
    }

    public int getGold() {
        return gold;
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", lose=" + lose +
                '}';
    }
}
