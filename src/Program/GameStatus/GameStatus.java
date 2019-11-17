package Program.GameStatus;

import Program.Config;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;

public abstract class GameStatus {
    protected Pane screen;
    protected Canvas canvas;

    protected static Stage stage;

    public GameStatus(){
        screen = new Pane();
        canvas = new Canvas(Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);
        screen.getChildren().add(canvas);
    }

    public static void setStage(Stage stage) {
        GameStatus.stage = stage;
    }

    public abstract void load();
}
