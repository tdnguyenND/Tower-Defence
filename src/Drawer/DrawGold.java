package Drawer;

import javafx.scene.paint.Color;

public class DrawGold extends Drawer {

    public static void draw(){
        String text = Integer.toString(player.getGold()) ;
        graphicsContext.setFill(Color.YELLOW);
        graphicsContext.fillText(text, 0, 10);
    }
}
