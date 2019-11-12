package Program;

import Music.MusicManager;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import java.io.File;
import javafx.stage.Stage;
import javafx.scene.media.MediaView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Main extends Application {

    BorderPane root;
    InputManager inputManager;
    @Override
    public void start(Stage primaryStage) throws Exception{

        root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle(Config.GAME_NAME);
        primaryStage.setScene(new Scene(root,Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT));

        Canvas canvas = new Canvas(Config.FIELD_WIDTH, Config.FIELD_HEIGHT);
        root.getChildren().add(canvas);
        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                inputManager.MouseHandling(mouseEvent);
            }
        });
        final GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        Controller controller = new Controller(graphicsContext);

        MusicManager.init(root);

        controller.start();
        inputManager = new InputManager(controller.gameManager.map);


        /**
         * TODO:
         *  - Add event handler
         */

        primaryStage.show();
        MusicManager.play();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
