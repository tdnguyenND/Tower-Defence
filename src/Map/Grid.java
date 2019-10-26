package Map;

import Program.Config;
import Program.Position;

public class Grid {
    protected int width = Config.GRID_WIDTH;
    protected int height = Config.GRID_HEIGHT;

    protected Position center;

    public Grid() {
    }

    public Grid(Position center) {
        this.center = center;
    }

    public Grid(int x, int y){
        this.center = new Position((x + 1.0/2) * height, (y + 1.0/2) * width);
    }

    public Position getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "Grid{" +
                "center=" + center +
                '}';
    }
}
