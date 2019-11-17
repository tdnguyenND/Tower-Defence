package GameEntity;

import Program.Position;
import javafx.geometry.Pos;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public abstract class GameObject {
    protected Position position;

    protected double width;
    protected double height;

    protected Image image;

    public GameObject(){

    }

    public GameObject(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /*
    public static boolean init(){
    }
    */

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Image getImage() {
        return image;
    }

    public void doDestroy() {

    }

    public void setLocation(Position _pos) {
        position.setPosition(_pos.getX(), _pos.getY());
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
                ", image='" + image + '\'' +
                '}';
    }
}
