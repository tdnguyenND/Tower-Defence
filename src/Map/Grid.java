package Map;

import GameEntity.GameObject;
import Program.Config;
import Program.Position;

public class Grid {
    protected static final int width = Config.GRID_WIDTH;
    protected static final int height = Config.GRID_HEIGHT;

    protected Position center;

    protected GameObject contain;

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

    public GameObject getContain() {
        return contain;
    }

    public void setContain(GameObject contain) {
        this.contain = contain;
    }

    @Override
    public String toString() {
        return "Grid{" +
                "center=" + center +
                '}';
    }
}
