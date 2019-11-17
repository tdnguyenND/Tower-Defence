package Program.GameStatus;

import Drawer.Drawer;
import Music.MusicManager;
import Program.Config;
import Program.InputManager;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

public class Playing extends GameStatus {
    @Override
    public void load() {
        Drawer.setGraphicsContext(canvas.getGraphicsContext2D());

        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                InputManager.MouseHandling(mouseEvent);
            }
        });

        MusicManager.init(screen);
        MusicManager.play();

        stage.setScene(new Scene(screen, Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT));
    }
}
