package Program;

import Drawer.Drawer;
import GameEntity.GameTile.Tower.TowerManager;
import Map.Map;
import Music.MusicManager;
import Program.GameStatus.GameStatus;
import Program.GameStatus.Playing;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller extends AnimationTimer {

    private Map map;
    GameManager gameManager;
    private Player player;
    private boolean onPause;
    private boolean onMenu;
    public static int SPEED = 1;
    private double COUNT = 1000000000.0/Config.GAME_FPS;

    private Stage stage;

    private GameStatus playing;
    private GameStatus menu;
    private GameStatus lose;
    private GameStatus win;

    private Canvas playingCanvas;

    InputManager inputManager;

    Controller(Stage stage) {
        this.stage = stage;

        gameManager = new GameManager();

        if (gameManager.init()){
            map = gameManager.map;
            player = gameManager.player;
            System.out.println("initialize game manager successful");
            TowerManager.createTower("InfernoTower", map.map[6][2]);
        }else System.out.println("fail to initialize game manager");

        InputManager.setMap(gameManager.map);

        if(Drawer.init(map, gameManager, gameManager.player )){
            System.out.println("initialize drawer successful");
        } else System.out.println("fail to initialize drawer");

        onPause = false;
        onMenu = true;

        GameStatus.setStage(stage);

        playing = new Playing();
    }

    @Override
    public void handle(long l) {
        /**
         * TODO:
         *  - Update
         *  - Draw
         *  - Sleep
         */
        long previousTime = System.nanoTime();

        //main game control here
        if (onMenu){
            /**
             * TODO:
             *  -On Menu Screen (create new class if necessary)
             *      Such as: Drawer.drawMenuScreen
             *  -Create Button:
             *      + Play game
             *      + Guide (if you create this button, add new attribute onGuide and new control to guide screen)
             *      + Quit
             */
            onMenu = false;
            playing.load();
        }
        else if(onPause){
            /**
             * TODO:
             *  - On Pause Screen (create new class if necessary)
             *      Such as: Drawer.drawPauseScreen
             *  - Create Button:
             *      + Resume
             *      + Quit
             */
            Drawer.draw();
        }
        else if (player.isLose()) {
            /**
             * TODO:
             *  - Lose Screen (create new class if necessary)
             *      Such as: Drawer.drawLoseScreen
             *  - Create Button:
             *      + Replay
             *      + Quit
             */
        }
        else if (player.isWin()){
            /**
             * TODO:
             *  - Win Screen (create new class if necessary)
             *      Such as: Drawer.drawWinScreen
             *  - Create Button: like Lose Screen
             */
        }
        else{
            /**
             * TODO:
             *  - On Active Screen
             *  - Update all entity
             *  - Create Button:
             *      + Music controller
             *      + Pause
             */
            GameManager.update();
            Drawer.draw();
        }

        long time = System.nanoTime() - previousTime;

        COUNT = COUNT/SPEED;
        if (time < COUNT) try{
            Thread.sleep((long)(COUNT - time)/1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        super.start();
    }
}
