package Program.GameStatus;

import Drawer.Drawer;
import Program.Config;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;

import java.awt.*;

public class Lose extends GameStatus {
    @Override
    public void load() {
        //Drawer.setGraphicsContext(canvas.getGraphicsContext2D());

        /**
         * -TODO : "you lose"
         */

        Scene scene = new Scene(root, Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);
        root.setBackground(Background.EMPTY);
        root.setStyle("-fx-background-image: url('data/images/background-01.png');");

        Button replay_btn = new Button("replay");
        replay_btn.setLayoutX(300);
        replay_btn.setLayoutY(300);
        replay_btn.setPrefSize(196, 50);
        replay_btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                /**
                 *  -TODO
                 */
            }
        });


        Button quit_btn = new Button("Quit");
        quit_btn.setLayoutX(300);
        quit_btn.setLayoutY(400);
        quit_btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.close();
            }
        });

        root.getChildren().addAll(replay_btn, quit_btn);

        stage.setScene(scene);

    }
}
