package Drawer;

import Map.*;
import Program.Config;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.File;

public class DrawField extends Drawer {
    private static Map map;

    public static boolean init(Map _map) {
        map = _map;
        return (map != null);
    }

    public static void draw(){
        File file = new File("src/data/image/background-03.png");
        String localURL = file.toURI().toString();
        Image image = new Image(localURL);
        graphicsContext.drawImage(image, 0, 0);

        for (int i = 0; i < map.nRows; i++){
            for (int j = 0; j < map.nCols; j++) {
                if (map.map[i][j] instanceof Mountain){
                    graphicsContext.setFill(Color.TRANSPARENT);
                }
                else{
                    graphicsContext.setFill(Color.AQUA);
                }
                graphicsContext.fillRect(j * Config.GRID_WIDTH, i * Config.GRID_HEIGHT, Config.GRID_WIDTH, Config.GRID_HEIGHT);
            }
        }
    }
}
