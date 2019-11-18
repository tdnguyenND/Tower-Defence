package Program.GameStatus;

import Drawer.Drawer;
import GameEntity.GameTile.Tower.InfernoTower;
import GameEntity.GameTile.Tower.Tower;
import Music.MusicManager;
import Program.Config;
import Program.Controller;
import Program.InputManager;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Playing extends GameStatus {
    private Button pauseBtn;
    private Button sellBtn;
    private Button infernoBtn;
    private Button normalBtn;
    private Button sniperBtn;
    private Button smallerBtn;
    private Button x2SpeedBtn;
    private Button upgradeBtn;
    private Button switchTypeBtn;
    private Button switchMusicBtn;

    @Override
    public void load() throws IOException {
        canvas = new Canvas(Config.FIELD_WIDTH, Config.FIELD_HEIGHT);
        Drawer.setGraphicsContext(canvas.getGraphicsContext2D());

        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                InputManager.MouseHandling(mouseEvent);
                if (InputManager.selected != null && InputManager.selected.getContain() != null && InputManager.selected.getContain() instanceof Tower){
                    /**
                     * TODO: display upgrade btn
                     */
                    upgradeBtn.setVisible(true);
                    if (InputManager.selected.getContain() instanceof InfernoTower){
                        /**
                         * TODO: display switch type button
                         */
                        switchTypeBtn.setVisible(true);
                    }
                }
                else {
                    /**
                     * TODO:
                     *  -hide upgrade and switch btn
                     */
                    upgradeBtn.setVisible(false);
                    switchTypeBtn.setVisible(false);
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
        loadUpgradeButton();
        loadSwitchTypeButton();
        loadSwitchMusicButton();

        root.getChildren().add(canvas);
    }

    private void loadX2SpeedButton(){
        x2SpeedBtn = new Button();

        x2SpeedBtn.setPrefSize(35, 35);
        x2SpeedBtn.setStyle("-fx-background-image: url('/data/image/x2-06.png'); -fx-background-size: 100% 100%");
        x2SpeedBtn.setLayoutX(120);
        x2SpeedBtn.setLayoutY(510.0);
        x2SpeedBtn.setOnMouseClicked(InputManager::doubleSpeed);
        x2SpeedBtn.setMnemonicParsing(false);

        root.getChildren().add(x2SpeedBtn);
    }

    private void loadNormalButton(){
        normalBtn = new Button();

        normalBtn.setPrefSize(120, 40);
        normalBtn.setStyle("-fx-background-image: url('/data/image/normal-05.png'); -fx-background-size: 100% 100%");
        normalBtn.setId("NormalTower");
        normalBtn.setLayoutX(170.0);
        normalBtn.setLayoutY(510.0);
        normalBtn.setMnemonicParsing(false);
        normalBtn.setOnMouseClicked(InputManager::chooseTypeTower);

        root.getChildren().add(normalBtn);
    }
    private void loadSmallerButton(){
        smallerBtn = new Button();

        smallerBtn.setPrefSize(120, 40);
        smallerBtn.setStyle("-fx-background-image: url('/data/image/macgun-05.png'); -fx-background-size: 100% 100%");
        smallerBtn.setId("SmallerTower");
        smallerBtn.setLayoutX(590.0);
        smallerBtn.setLayoutY(510.0);
        smallerBtn.setMnemonicParsing(false);
        smallerBtn.setOnMouseClicked(InputManager::chooseTypeTower);

        root.getChildren().add(smallerBtn);
    }
    private void loadSniperButton(){
        sniperBtn = new Button();

        sniperBtn.setPrefSize(120, 40);
        sniperBtn.setStyle("-fx-background-image: url('/data/image/sniper-05.png'); -fx-background-size: 100% 100%");
        sniperBtn.setId("SniperTower");
        sniperBtn.setLayoutX(310.0);
        sniperBtn.setLayoutY(510.0);
        sniperBtn.setMnemonicParsing(false);
        sniperBtn.setOnMouseClicked(InputManager::chooseTypeTower);

        root.getChildren().add(sniperBtn);
    }

    private void loadInfernoButton(){
        infernoBtn = new Button();

        infernoBtn.setPrefSize(120, 40);
        infernoBtn.setStyle("-fx-background-image: url('/data/image/inferno-05.png'); -fx-background-size: 100% 100%");
        infernoBtn.setId("InfernoTower");
        infernoBtn.setLayoutX(450.0);
        infernoBtn.setLayoutY(510.0);
        infernoBtn.setMnemonicParsing(false);
        infernoBtn.setOnMouseClicked(InputManager::chooseTypeTower);

        root.getChildren().add(infernoBtn);
    }

    private void loadSellButton(){
        sellBtn = new Button();

        sellBtn.setStyle("-fx-background-image: url('/data/image/sell-06.png'); -fx-background-size: 100% 100%");
        sellBtn.setPrefSize(35, 35);
        sellBtn.setLayoutX(120);
        sellBtn.setLayoutY(555.0);
        sellBtn.setMnemonicParsing(false);
        sellBtn.setOnMouseClicked(InputManager::wantToSellTower);

        root.getChildren().add(sellBtn);
    }

    private void loadPauseButton(){
        pauseBtn = new Button();

        pauseBtn.setStyle("-fx-background-image: url('/data/image/pause-06.png'); -fx-background-size: 100% 100%");
        pauseBtn.setPrefSize(35, 35);
        pauseBtn.setLayoutX(170);
        pauseBtn.setLayoutY(555.0);
        pauseBtn.setMnemonicParsing(false);
        pauseBtn.setOnMouseClicked(Controller::pause);

        root.getChildren().add(pauseBtn);

    }

    private void loadUpgradeButton(){
        upgradeBtn = new Button();

        upgradeBtn.setId("upgrade");
        upgradeBtn.setStyle("-fx-background-image: url('/data/image/upgrade-06.png'); -fx-background-size: 100% 100%");
        upgradeBtn.setPrefSize(35, 35);
        upgradeBtn.setLayoutY(555);
        upgradeBtn.setLayoutX(215);
        upgradeBtn.setMnemonicParsing(false);
        upgradeBtn.setOnMouseClicked(InputManager::upgrade);
        upgradeBtn.setVisible(false);

        root.getChildren().add(upgradeBtn);
    }

    private void loadSwitchTypeButton(){
        switchTypeBtn = new Button();

        switchTypeBtn.setId("switch");

        switchTypeBtn.setStyle("-fx-background-image: url('/data/image/switch-06.png'); -fx-background-size: 100% 100%");
        switchTypeBtn.setLayoutY(555);
        switchTypeBtn.setLayoutX(260);
        switchTypeBtn.setPrefSize(35, 35);
        switchTypeBtn.setMnemonicParsing(false);
        switchTypeBtn.setOnMouseClicked(InputManager::switchType);
        switchTypeBtn.setVisible(false);

        root.getChildren().add(switchTypeBtn);
    }

    private void loadSwitchMusicButton(){
        switchMusicBtn = new Button();

        switchMusicBtn.setStyle("-fx-background-image: url('/data/image/changemusic-06.png'); -fx-background-size: 100% 100%");
        switchMusicBtn.setLayoutX(20);
        switchMusicBtn.setLayoutY(510);
        switchMusicBtn.setPrefSize(35, 35);
        switchMusicBtn.setMnemonicParsing(false);
        switchMusicBtn.setOnMouseClicked(InputManager::switchMusic);

        root.getChildren().add(switchMusicBtn);
    }
}
