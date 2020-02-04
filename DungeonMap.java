
public class DungeonMap {
    private Room[][] rooms;
    private String[][] map;
    private Player player;
    private int playerXPosition;
    private int playerYPosition;
    private int rows;
    private int columns;
    private final String WALL_MAP_POSITION = "*";
    private final String EMPTY_MAP_POSITION = " ";
    private final String PLAYER_MAP_POSITION = "P";

    public DungeonMap (int rows, int columns){
        map = new String[rows][columns];
        initMap();
    }

    private void initMap(){
        for(int i =  0; i < rows; i++){
            for(int j = 0; j  < columns; j++){
                map[i][j] = EMPTY_MAP_POSITION;
            }
        }
        map[playerYPosition][playerXPosition] = PLAYER_MAP_POSITION;
    }

    public void print(){
        printFirstLastBorder();
        for(int i = 0; i < map.length; i++){
            System.out.print(WALL_MAP_POSITION);
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println(WALL_MAP_POSITION);
        }
        printFirstLastBorder();
    }

    public void printFirstLastBorder(){
        for(int i =0; i<map[0].length; i++){
            System.out.print(WALL_MAP_POSITION);
        }
    }

    public void movePlayerUp(){

    }

    public void movePlayerDown(){
        map[playerYPosition][playerXPosition] = EMPTY_MAP_POSITION;
        playerYPosition++;
        map[playerYPosition][playerXPosition] = PLAYER_MAP_POSITION;
    }
    public void movePlayerLeft(){

    }
    public void movePlayerRight(){

    }
}
