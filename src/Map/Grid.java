package Map;

import Program.Config;
import Program.Position;

public class Grid {
    protected static final int width = Config.GRID_WIDTH;
    protected static final int height = Config.GRID_HEIGHT;

    protected Position center;

    protected boolean filled;

    public Grid() {
    }

    public Grid(Position center) {
        this.center = center;
    }

    public Grid(int x, int y){
        this.center = new Position((int)((x + 1.0/2) * height), (int)((y + 1.0/2) * width));
    }

    public Position getCenter() {
        return center;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Grid{" +
                "center=" + center +
                '}';
    }
}