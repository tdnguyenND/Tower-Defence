package Program.GameStatus;

import Drawer.Drawer;
import GameEntity.GameTile.Tower.InfernoTower;
import GameEntity.GameTile.Tower.Tower;
import Music.MusicManager;
import Program.Config;
import Program.Controller;
import Program.InputManager;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Playing extends GameStatus {
    Button pauseBtn;
    Button sellBtn;
    Button infernoBtn;
    Button normalBtn;
    Button sniperBtn;
    Button smallerBtn;
    Button x2SpeedBtn;

    @Override
    public void load() throws IOException {
        canvas = new Canvas(Config.FIELD_WIDTH, Config.FIELD_HEIGHT);
        Drawer.setGraphicsContext(canvas.getGraphicsContext2D());

        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                InputManager.MouseHandling(mouseEvent);
                if (InputManager.selected != null && InputManager.selected.getContain() instanceof Tower){
                    /**
                     * TODO: display upgrade btn
                     */
                    if (InputManager.selected.getContain() instanceof InfernoTower){
                        /**
                         * TODO: display switch type button
                         */
                    }
                }
                else {
                    /**
                     * TODO:
                     *  -hide upgrade and switch btn
                     */
                }
            }
        });

        MusicManager.init(root);
        MusicManager.play();

        loadX2SpeedButton();
        loadNormalButton();
        loadSmallerButton();
        loadSniperButton();
        loadInfernoButton();

        loadSellButton();
        loadPauseButton();

        root.getChildren().add(canvas);
    }

    private void loadX2SpeedButton(){
        x2SpeedBtn = new Button("x2");

        x2SpeedBtn.setLayoutX(79.0);
        x2SpeedBtn.setLayoutY(545.0);
        x2SpeedBtn.setOnMouseClicked(InputManager::doubleSpeed);
        x2SpeedBtn.setMnemonicParsing(false);

        root.getChildren().add(x2SpeedBtn);
    }

    private void loadNormalButton(){
        normalBtn = new Button();

        normalBtn.setId("NormalTower");
        normalBtn.setLayoutX(513.0);
        normalBtn.setLayoutY(514.0);
        normalBtn.setMnemonicParsing(false);
        normalBtn.setText("Normal Tower");
        normalBtn.setOnMouseClicked(InputManager::chooseTypeTower);

        root.getChildren().add(normalBtn);
    }
    private void loadSmallerButton(){
        smallerBtn = new Button();

        smallerBtn.setId("SmallerTower");
        smallerBtn.setLayoutX(513.0);
        smallerBtn.setLayoutY(545.0);
        smallerBtn.setMnemonicParsing(false);
        smallerBtn.setText("SmallerTower");
        smallerBtn.setOnMouseClicked(InputManager::chooseTypeTower);

        root.getChildren().add(smallerBtn);
    }
    private void loadSniperButton(){
        sniperBtn = new Button();

        sniperBtn.setId("SniperTower");
        sniperBtn.setLayoutX(410.0);
        sniperBtn.setLayoutY(514.0);
        sniperBtn.setMnemonicParsing(false);
        sniperBtn.setText("Sniper Tower");
        sniperBtn.setOnMouseClicked(InputManager::chooseTypeTower);

        root.getChildren().add(sniperBtn);
    }

    private void loadInfernoButton(){
        infernoBtn = new Button();

        infernoBtn.setId("InfernoTower");
        infernoBtn.setLayoutX(407.0);
        infernoBtn.setLayoutY(545.0);
        infernoBtn.setMnemonicParsing(false);
        infernoBtn.setText("Inferno Tower");
        infernoBtn.setOnMouseClicked(InputManager::chooseTypeTower);

        root.getChildren().add(infernoBtn);
    }

    private void loadSellButton(){
        sellBtn = new Button();

        sellBtn.setLayoutX(124.0);
        sellBtn.setLayoutY(545.0);
        sellBtn.setMnemonicParsing(false);
        sellBtn.setOnMouseClicked(InputManager::wantToSellTower);
        sellBtn.setText("Sell");

        root.getChildren().add(sellBtn);
    }

    private void loadPauseButton(){
        pauseBtn = new Button();

        pauseBtn.setLayoutX(185.0);
        pauseBtn.setLayoutY(545.0);
        pauseBtn.setMnemonicParsing(false);
        pauseBtn.setOnMouseClicked(Controller::pause);
        pauseBtn.setText("Pause");

        root.getChildren().add(pauseBtn);

    }

}
