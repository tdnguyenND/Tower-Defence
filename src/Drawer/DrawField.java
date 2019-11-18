package Drawer;

import Map.*;
import Program.Config;
import javafx.scene.paint.Color;

public class DrawField extends Drawer {
    private static Map map;

    public static boolean init(Map _map) {
        map = _map;
        return (map != null);
    }

    public static void draw(){
        for (int i = 0; i < map.nRows; i++){
            for (int j = 0; j < map.nCols; j++) {
                if (map.map[i][j] instanceof Mountain){
                    graphicsContext.setFill(Color.BLACK);
                }
                else graphicsContext.setFill(Color.RED);

                graphicsContext.fillRect(j * Config.GRID_WIDTH, i * Config.GRID_HEIGHT, Config.GRID_WIDTH, Config.GRID_HEIGHT);
            }
        }
    }
}
