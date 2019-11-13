package Debugger;

import GameEntity.GameObject;
import Program.Player;

import java.util.ArrayList;
import java.util.List;

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

    public static void log(ArrayList<ArrayList<Integer>> l){
        for (List list : l) {
            for (Object o : list) {
                System.out.print(o+ " ");
            }
            System.out.println();
        }
    }
    private Log(){

    }
}
