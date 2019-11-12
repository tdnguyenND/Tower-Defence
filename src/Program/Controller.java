package Program;

import Drawer.Drawer;
import Map.Map;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

public class Controller extends AnimationTimer {

    private Map map;
    GameManager gameManager;
    private Player player;
    private boolean onPause;
    private boolean onMenu;

    Controller(GraphicsContext _graphicsContext) {

        gameManager = new GameManager();
        if (gameManager.init()){
            map = gameManager.map;
            player = gameManager.player;
            System.out.println("initialize game manager successful");
        }else System.out.println("fail to initialize game manager");

        if(Drawer.init(_graphicsContext, map, gameManager, gameManager.player )){
            System.out.println("initialize drawer successful");
        } else System.out.println("fail to initialize drawer");

        onPause = false;
        onMenu = true;
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

        if (time < Config.COUNT) try{
            Thread.sleep((long)(Config.COUNT - time)/1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        Drawer.draw();
        super.start();
    }
}
