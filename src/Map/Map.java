package Map;

import Program.Config;
import Program.Position;

public class Map {

    private int width;
    private int height;

    private int nRows;
    private int nCols;

    private Position startPoint;
    private Position finishPoint;

    public Grid[][] map;

    public Map(){
        width = Config.FIELD_WIDTH;
        height = Config.FIELD_HEIGHT;

        nRows = height/Config.GRID_HEIGHT;
        nCols = width/Config.GRID_WIDTH;

        startPoint = null;
        finishPoint = null;

        map = new Grid[nRows][nCols];
    }

    public void init(){
        for (int i = 0; i < nRows; i++){
            for (int j = 0; j < nCols; j++){
                map[i][j] = new Mountain(i, j);
            }
        }
        for (int i = 0; i < Line.size; i++) {
            int x = Line.line[i][0];
            int y = Line.line[i][1];
            map[x][y] = new Road(x, y);
        }
        startPoint = new Position(Line.line[0][0], Line.line[0][1]);
        finishPoint = new Position(Line.line[Line.size - 1][0], Line.line[Line.size - 1][1]);

    }

    public static void main(String[] args) {
        Road r = new Road();
        System.out.println(r.getClass());
    }
}
