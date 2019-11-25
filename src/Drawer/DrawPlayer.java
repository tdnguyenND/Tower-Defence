package Drawer;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.File;

public class DrawPlayer extends Drawer {

    private static Image heart;
    private static Image coin;

    public static boolean init(){
        heart = new Image(new File("src/data/image/heart.png").toURI().toString());
        coin = new Image(new File("src/data/image/coin.png").toURI().toString());
        return true;
    }

    public static void draw(){
        drawGold();
        drawHealth();
    }

    public static void drawGold(){
        String text = Integer.toString(player.getGold());
        graphicsContext.drawImage(heart,0,0,20,20);
        graphicsContext.setFill(Color.YELLOW);
        graphicsContext.fillText(text, 20, 40);
        graphicsContext.setFont(Font.font("Verdana", 20));
    }

    public static void drawHealth(){
        String text = Integer.toString(player.getHealth()) ;

        graphicsContext.drawImage(coin,0,22,20,20);
        graphicsContext.setFill(Color.RED);
        graphicsContext.fillText(text, 20, 16);
        graphicsContext.setFont(Font.font("Verdana", 22));
    }
}
