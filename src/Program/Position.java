package Program;

import java.util.Objects;

public class Position {
    private int x;
    private int y;

    public Position() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position other){
        this.x = other.x;
        this.y = other.y;
    }

    public void setPosition(int x, int y){
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double distance(Position other){
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.x - x, 2));
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
