package Program.GameStatus;

import Program.Controller;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;

public class Menu extends GameStatus {

    @Override
    public void load() {

        //Drawer.setGraphicsContext(canvas.getGraphicsContext2D());
        root.setBackground(Background.EMPTY);
        root.setStyle("-fx-background-image: url('/data/images/background-01.png');");

        Button play_btn = new Button();
        play_btn.setPrefSize(196, 50);
        play_btn.setLayoutX(300);
        play_btn.setLayoutY(300);
        play_btn.setStyle("-fx-background-image: url('/data/images/play-04.png');");
        play_btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Controller.onPlay = true;
                Controller.onMenu = false;
                Controller.playing.use();
            }
        });

        Button quit_btn = new Button();
        quit_btn.setStyle("-fx-background-image: url('/data/image/exit-04.png');");
        quit_btn.setPrefSize(196, 50);
        quit_btn.setLayoutX(300);
        quit_btn.setLayoutY(400);
        quit_btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.close();
            }
        });

        root.getChildren().addAll(play_btn, quit_btn);
    }
}
