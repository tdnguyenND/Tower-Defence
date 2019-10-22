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
    private Log(){

    }
}
