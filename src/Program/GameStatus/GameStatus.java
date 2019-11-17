package Program.GameStatus;

import Program.Config;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;

import java.io.IOException;

public abstract class GameStatus {
    protected Pane root;
    protected Canvas canvas;

    protected static Stage stage;

    public GameStatus(){
        root = new Pane();
       // canvas = new Canvas(Config.FIELD_WIDTH, Config.FIELD_HEIGHT);
    }

    public static void setStage(Stage stage) {
        GameStatus.stage = stage;
    }

    public abstract void load() throws IOException;
}
