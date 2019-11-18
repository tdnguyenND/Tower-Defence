package Program.GameStatus;

import Program.Config;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;

import java.io.IOException;

public abstract class GameStatus {
    protected Pane root;
    protected Canvas canvas;
    protected Scene scene;

    protected static Stage stage;

    public GameStatus(){
        root = new Pane();
        scene = new Scene(root, Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);
    }

    public static void setStage(Stage stage) {
        GameStatus.stage = stage;
    }

    public abstract void load() throws IOException;

    public void use(){
        stage.setScene(scene);
    }
}
