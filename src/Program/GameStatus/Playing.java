package Program.GameStatus;

import Drawer.Drawer;
import Music.MusicManager;
import Program.Config;
import Program.InputManager;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.lang.reflect.Field;

public class Playing extends GameStatus {
    @Override
    public void load() throws IOException {
        canvas = new Canvas(Config.FIELD_WIDTH, Config.FIELD_HEIGHT);
        Drawer.setGraphicsContext(canvas.getGraphicsContext2D());

        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                InputManager.MouseHandling(mouseEvent);
            }
        });

        MusicManager.init(root);
        MusicManager.play();

        Node node = FXMLLoader.load(getClass().getResource("/Program/GameStatus/playingState.fxml"));
        root.getChildren().add(node);
        root.getChildren().add(canvas);

        stage.setScene(new Scene(root, Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT));
    }
}
