package GameEntity;

import Program.Position;

public abstract class GameObject implements Action {
    protected Position position;

    protected double width;
    protected double height;

    protected String color;

    public GameObject(){

    }

    public GameObject(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void init(){
        /**
         * TODO:
         */
    }

    @Override
    public void doDestroy() {

    }

    @Override
    public void setLocation(Position pos) {

    }

    @Override
    public Position getLocation() {
        return this.position;
    }

    @Override
    public String toString() {
        return "GameObject{" +
                "position=" + position +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
