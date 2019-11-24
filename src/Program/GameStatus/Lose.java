package Program.GameStatus;

import Program.Controller;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;

public class Lose extends GameStatus {
    @Override
    public void load() {

        /**
         * -TODO : "you lose"
         */
        root.setBackground(Background.EMPTY);

        root.setStyle("-fx-background-image: url('/data/images/background-01.png')");
        Button replay_btn = new Button("-");
        replay_btn.setLayoutX(300);
        replay_btn.setLayoutY(300);
        replay_btn.setStyle("-fx-background-image: url('/data/image/playagain-04.png')");
        replay_btn.setPrefSize(196, 50);
        replay_btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
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
        quit_btn.setStyle("-fx-background-image: url('/data/image/exit-04.png')");
        quit_btn.setPrefSize(196, 50);
        quit_btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.close();
            }
        });

        root.getChildren().addAll(replay_btn, quit_btn);
    }
}
