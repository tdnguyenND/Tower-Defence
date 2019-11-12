package Program;

import javafx.scene.layout.BorderPane;

public class Player {
    private double health;
    private boolean lose;
    private boolean win;
    private int gold;

    public Player(){
    }

    public void beAttacked(){
        this.health--;
        if (health < 0) setLose(true);
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
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

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", lose=" + lose +
                '}';
    }
}