package Map;

import Program.Position;

public class Mountain extends Grid {
    public Mountain() {
    }

    public Mountain(Position center) {
        super(center);
    }

    public Mountain(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "center=" + center +
                '}';
    }
}
