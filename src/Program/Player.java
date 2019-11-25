package Program;

public class Player {
    private int health;
    private boolean lose;
    private boolean win;
    private int gold;

    public Player(){
        this.health = 20;
    }

    public void beAttacked(){
        this.health--;
        if (health < 0) setLose(true);
    }

    public boolean isWin() {
        return win;
    }

    public boolean isLose(){
        return this.lose;
    }

    public void setLose(boolean lose){
        this.lose = lose;
    }

    public int getGold() {
        return gold;
    }

    public void earnMoney(int reward) {
        gold += reward;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", lose=" + lose +
                '}';
    }

    public void restart(){
        health = Config.defaultPlayerHealth;
        gold = Config.defaultPlayerGold;
        win = false;
        lose = false;
    }
}