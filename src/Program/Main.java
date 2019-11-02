package Program;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.text.FontSmoothingType;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        final Canvas canvas = new Canvas(Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);
        final GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        Controller controller = new Controller(graphicsContext);

        canvas.setFocusTraversable(true);
        graphicsContext.setFontSmoothingType(FontSmoothingType.LCD);

        primaryStage.setResizable(false);
        primaryStage.setTitle(Config.GAME_NAME);

        controller.start();

        StackPane root = new StackPane(canvas);
        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
