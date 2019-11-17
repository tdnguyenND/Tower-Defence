package Music;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;

public class MusicManager {
    private static MediaPlayer[] mediaPlayer;
    private static int currentVersion = MusicConfig.defaultVersion;

    private static String path(int count){
        switch (count){
            case 2:
                return new File(MusicConfig.path2).toURI().toString();
            case 3:
                return new File(MusicConfig.path3).toURI().toString();
            default:
                return new File(MusicConfig.path1).toURI().toString();
        }
    }

    public static void init(Pane root){
        Media[] media = new Media[3];
        mediaPlayer = new MediaPlayer[3];

        for (int i = 0; i < 3; i++){
            media[i] = new Media(path(i + 1));
            mediaPlayer[i] = new MediaPlayer(media[i]);
            MediaView mv = new MediaView(mediaPlayer[i]);
            root.getChildren().add(mv);
            mediaPlayer[i].setCycleCount(MediaPlayer.INDEFINITE);
        }
    }

    public static void switchVersion(int currentVersion) {
        if (currentVersion != MusicManager.currentVersion) {
            stop();
            MusicManager.currentVersion = currentVersion;
            play();
        }
    }

    public static void play(){
        mediaPlayer[currentVersion].play();
    }

    public static void stop(){
        mediaPlayer[currentVersion].stop();
    }
}
