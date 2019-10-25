package Map;

import Program.Config;

public class Map {

    private int width = Config.SCREEN_WIDTH;
    private int height = Config.SCREEN_HEIGHT;

    private int nRows = Config.FIELD_HEIGHT/Config.GRID_HEIGHT;
    private int nCols = Config.FIELD_WIDTH/Config.GRID_WIDTH;

    private Grid[][] map = new Grid[nRows][nCols];

    public Map(){
        for (int i = 0; i < nRows; i++){
            for (int j = 0; j < nCols; j++){
                map[i][j] = new Mountain(i, j);
            }
        }
        for (int i = 0; i < Line.size; i++){
            int x = Line.line[i][0];
            int y = Line.line[i][1];
            map[x][y] =  new Road(x, y);
        }
    }

    public static void main(String[] args) {
        Map p = new Map();
        for (int i = 0; i < p.nRows; i++){
            {
                for (int j = 0; j < p.nCols; j++)
                    System.out.print((p.map)[i][j]);
            }
            System.out.println();
        }
    }
}
