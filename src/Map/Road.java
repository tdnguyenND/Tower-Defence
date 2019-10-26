package Map;

import Program.Position;

public class Road extends Grid {
    public Road() {
    }

    public Road(Position center) {
        super(center);
    }

    public Road(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Road{" +
                "center=" + center +
                '}';
    }
}
