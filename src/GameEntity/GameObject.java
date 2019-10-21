package GameEntity;

import Program.Position;

public abstract class GameObject implements Action {
    protected Position position;

    protected double width;
    protected double height;

    protected String color;

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
}
