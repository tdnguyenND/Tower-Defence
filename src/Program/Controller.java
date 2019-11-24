package Program;

import Drawer.Drawer;
import Map.Map;
import Program.GameStatus.*;
import javafx.animation.AnimationTimer;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller extends AnimationTimer {

    public static Map map;
    GameManager gameManager;
    private static Player player;
    public static boolean onMenu;
    public static boolean onPause;
    public static boolean onPlay;
    public static double COUNT = Config.COUNT;

    private Stage stage;

    public static GameStatus playing;
    private GameStatus menu;
    private GameStatus lose;
    private GameStatus win;

    Controller(Stage stage) {
        this.stage = stage;

        gameManager = new GameManager();

        if (gameManager.init()){
            map = gameManager.map;
            player = GameManager.player;
            System.out.println("initialize game manager successful");
        }else System.out.println("fail to initialize game manager");

        InputManager.setMap(gameManager.map);

        if(Drawer.init(map, gameManager, GameManager.player)){
            System.out.println("initialize drawer successful");
        } else System.out.println("fail to initialize drawer");

        onPause = false;
        onMenu = true;

        GameStatus.setStage(stage);

        playing = new Playing();
        menu = new Menu();
        lose = new Lose();
        win = new Win();
        try{
            playing.load();
            menu.load();
            lose.load();
            win.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        menu.use();
    }

    public static void restart(){
        GameManager.restart();
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
            try {
                win.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(onPlay) {
            /**
             * TODO:
             *  - On Active Screen
             *  - Update all entity
             *  - Create Button:
             *      + Music controller
             *      + Pause
             */
            GameManager.update();

           if (player.isLose()) lose.use();
           else if (player.isWin()) win.use();

            Drawer.draw();
        }

        long time = System.nanoTime() - previousTime;

        if (time < COUNT) try{
            long delay = (long)((COUNT - time)/1000000);
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        super.start();
    }

    public static void pause(MouseEvent event) {
        onPause = !onPause;
    }
}
