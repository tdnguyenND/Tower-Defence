package Debugger;

import GameEntity.GameObject;
import Program.Player;

public class Log {
    public static void log(GameObject obj){
        System.out.println(obj);
    }

    public static void log(Player player){
        System.out.println(player);
    }

    public static void log(Exception e){
        System.out.println(e.getMessage());
    }
    private Log(){

    }
}
