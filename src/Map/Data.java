package Map;

import Debugger.Log;
import Program.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static final String mapPath = "src/data/map.txt";
    public static ArrayList<ArrayList<Integer>> line;
    public static int size;

    private static ArrayList<ArrayList<Integer>> findLine(int[][] map, int startX, int startY){
        ArrayList<ArrayList<Integer>> line = new ArrayList<>();
        ArrayList<Integer> ele = new ArrayList<>();
        ele.add(startX);
        ele.add(startY);
        line.add(ele);

        for (int i = Math.max(0, startX - 1); i <= Math.min(Config.ROW - 1, startX + 1); i++){
            for (int j = Math.max(0, startY - 1); j <= Math.min(Config.COLUMN - 1, startY + 1); j++){
                if ((i + j - startX - startY) % 2 == 0) continue;
                if (map[i][j] != 0){
                    map[i][j] = 0;
                    line.addAll(findLine(map, i, j));
                    return line;
                }
            }
        }
        return line;
    }

    public static final void init(){
        try{
            Scanner sc = new Scanner(new File(mapPath));
            int[][] map = new int[Config.ROW][Config.COLUMN];

            int startX = -1, startY = -1;

            line = new ArrayList<>();
            for (int i = 0; i < Config.ROW; i++){
                for (int j = 0; j < Config.COLUMN; j ++){
                    map[i][j] = sc.nextInt();
                    if (map[i][j] == 3){
                        startX = i;
                        startY = j;
                    }
                }
            }

            map[startX][startY] = 0;
            line = findLine(map, startX, startY);
            size = line.size();

            Log.log(line);
        }catch (FileNotFoundException ex){
            System.out.println("File not exist");;
        }
    }

    public static int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private Data(){};
}
