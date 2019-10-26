package Program;

import java.util.Objects;

public class Position {
    private double x;
    private double y;

    public Position() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position other){
        this.x = other.x;
        this.y = other.y;
    }

    public void setPosition(double x, double y){
        /**
         *
         */
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Double.compare(position.x, x) == 0 &&
                Double.compare(position.y, y) == 0;
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
