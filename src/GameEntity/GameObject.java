package GameEntity;

import Program.Position;

public abstract class GameObject {
    protected Position position;

    protected double width;
    protected double height;
    protected double xPos;
    protected double yPos;

    protected String color;

    public GameObject(){

    }

    public GameObject(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static boolean init(){
        /**
         * TODO:
         */
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void doDestroy() {

    }

    public static void setLocation(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Position getLocation() {
        return this.position;
    }

    @Override
    public String toString() {
        return "GameObject{" +
                "position=" + position +
                ", width=" + width +
                ", height=" + height +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                ", color='" + color + '\'' +
                '}';
    }
}
