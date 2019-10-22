package Program;

public class Position {
    private double x;
    private double y;

    public Position() {
    }

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setPosition(double x, double y){
        /**
         *
         */
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
