package Drawer;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class DrawGold extends Drawer {

    public static void draw(){
        String text = Integer.toString(player.getGold()) ;
        graphicsContext.setFill(Color.YELLOW);
        graphicsContext.fillText(text, 3, 20);
        graphicsContext.setFont(Font.font("Verdana", 20));
    }
}
