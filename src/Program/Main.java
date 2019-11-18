package Program;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle(Config.GAME_NAME);

        Controller controller = new Controller(primaryStage);

        controller.start();
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
