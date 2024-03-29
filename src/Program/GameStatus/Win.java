package Program.GameStatus;

import Program.Controller;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;

public class Win extends GameStatus {
    @Override
    public void load() {
        //Drawer.setGraphicsContext(canvas.getGraphicsContext2D());

        /**
         * -TODO : "you Win"
         */
        root.setBackground(Background.EMPTY);
        root.setStyle("-fx-background-image: url('/data/image/win-01.png');");

        Button next_btn = new Button();
        next_btn.setLayoutX(300);
        next_btn.setLayoutY(300);

        next_btn.setStyle("-fx-background-image: url('/data/image/playagain-04.png')");
        next_btn.setPrefSize(196, 50);
        next_btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                /**
                 *  -TODO
                 */
                Controller.restart();
                Controller.playing.use();
            }
        });

        Button quit_btn = new Button("Quit");
        quit_btn.setLayoutX(300);
        quit_btn.setLayoutY(400);
        quit_btn.setPrefSize(196, 50);
        quit_btn.setStyle("-fx-background-image: url('/data/image/exit-04.png')");
        quit_btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.close();
            }
        });

        root.getChildren().addAll(next_btn, quit_btn);
    }
}
