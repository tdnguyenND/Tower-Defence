package Map;

import Program.Config;

public class Map {

    private static final int width = Config.FIELD_WIDTH;
    private static final int height = Config.FIELD_HEIGHT;

    public static final int nRows = Config.ROW;
    public static final int nCols = Config.COLUMN;

    public Grid startPoint;
    public Grid finishPoint;

    public Grid[][] map;

    public Map(){
    }

    public void init(){
        /**
         * TODO:
         *  - Determine map: where mountain or road
         *  - Determine start and finish point
         */
        map = new Grid[nRows][nCols];

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
        startPoint = map[Data.line[0][0]][Data.line[0][1]];
        finishPoint = map[Data.line[Data.size - 1][0]][Data.line[Data.size - 1][1]];
    }
}
