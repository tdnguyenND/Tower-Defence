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

    public void change(double x, double y){
        /**
         *
         */
        this.x += x;
        this.y += y;
    }
}
