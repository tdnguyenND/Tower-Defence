package GameEntity;

import Program.Position;

public interface Action {
    void init();

    void doDestroy();

    void setLocation(Position pos);

    Position getLocation();
}
