package GameEntity;

import Program.Position;

import javafx.scene.paint.Color;

public abstract class GameObject {
    protected Position position;

    protected double width;
    protected double height;

    protected Color color;

    public GameObject(){

    }

    public GameObject(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static void init(){
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

    public Color getColor() {
        return color;
    }

    public void doDestroy() {

    }

    public void setLocation(double x, double y) {

    }

    public Position getLocation() {
        return this.position;
    }

    public String toString() {
        return "GameObject{" +
                "position=" + position +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
