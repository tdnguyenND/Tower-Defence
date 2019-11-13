package Map;

import Program.Config;

public class Map {
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
        Data.init();

        for (int i = 0; i < nRows; i++){
            for (int j = 0; j < nCols; j++){
                map[i][j] = new Mountain(i, j);
            }
        }
        for (int i = 0; i < Data.size; i++) {
            int x = Data.line.get(i).get(0);
            int y = Data.line.get(i).get(1);
            map[x][y] = new Road(x, y);
        }
        startPoint = map[Data.line.get(0).get(0)][Data.line.get(0).get(1)];
        finishPoint = map[Data.line.get(Data.size - 1).get(0)][Data.line.get(Data.size - 1).get(1)];
    }
}
