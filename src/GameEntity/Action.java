package GameEntity;

import Program.Position;

public interface Action {
    void init();

    void doDestroy();

    void setLocation(double x, double y);

    Position getLocation();
}
