package Program;

import Drawer.Drawer;
import Map.Map;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

public class Controller extends AnimationTimer {
    private Map map;
    GameManager gameManager;

    Controller(GraphicsContext _graphicsContext) {

        gameManager = new GameManager();
        if (gameManager.init()){
            map = gameManager.map;
            System.out.println("initialize game manager successful");
        }else System.out.println("fail to initialize game manager");

        if(Drawer.init(_graphicsContext, map, gameManager, gameManager.player )){
            System.out.println("initialize drawer successful");
        } else System.out.println("fail to initialize drawer");
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

        GameManager.update();
        Drawer.draw();

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
