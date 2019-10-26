package Map;

import Program.Config;

public class Map {

    private int width;
    private int height;

    private int nRows;
    private int nCols;

    public Grid[][] map;

    public Map(){
        width = Config.FIELD_WIDTH;
        height = Config.FIELD_HEIGHT;

        nRows = height/Config.GRID_HEIGHT;
        nCols = width/Config.GRID_WIDTH;

        map = new Grid[nRows][nCols];
    }

    public void init(){
        for (int i = 0; i < nRows; i++){
            for (int j = 0; j < nCols; j++){
                map[i][j] = new Mountain(i, j);
            }
        }
        for (int i = 0; i < Data.size; i++) {
            int x = Data.line[i][0];
            int y = Data.line[i][1];
            map[x][y] = new Road(x, y);
        }
    }
}
