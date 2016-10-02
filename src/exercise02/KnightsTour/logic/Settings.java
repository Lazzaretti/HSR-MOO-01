package exercise02.KnightsTour.logic;

import exercise02.KnightsTour.logic.Coordinate;
import exercise02.KnightsTour.logic.Ways;

/**
 * Created by flazz on 02.10.2016.
 */
public class Settings {
    public Ways ways;
    public int height, width;
    public Coordinate start;

    public Settings(){
        this(2,2);
    }

    public Settings(int startX,int startY){
        this(startX,startY,5,6);
    }

    public Settings(int startX,int startY,int mapWidth,int mapHeight){
        start = new Coordinate(startX, startY);
        this.width = mapWidth;
        this.height = mapHeight;
    }

}
