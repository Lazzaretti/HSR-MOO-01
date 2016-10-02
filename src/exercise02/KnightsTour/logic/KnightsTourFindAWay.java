package exercise02.KnightsTour.logic;

/**
 * Created by flazz on 01.10.2016.
 * Springerproblem
 * https://de.wikipedia.org/wiki/Springerproblem
 */
public class KnightsTourFindAWay extends KnightsTour {

    public KnightsTourFindAWay(){
        super();
    }

    public KnightsTourFindAWay(int startX, int startY){
        super(startX,startY);
    }

    public KnightsTourFindAWay(int startX, int startY, int mapWidth, int mapHeight){
        super(startX,startY,mapWidth,mapHeight);
    }

    public KnightsTourFindAWay(Settings settings){
        super(settings);
    }

    protected Ways findWay(Coordinate position, Way way){
        Ways actuWay;
        for(int x=-2;x<3;x++) {
            if (x != 0) {
                for (int y = -2; y < 3; y++) {
                    if (y != 0 && x != y && -x != y){
                        actuWay = find(position.adabtedCoord(x,y),way.clone());
                        if (actuWay != null){
                            return actuWay;
                        }
                    }
                }
            }
        }
        return null;
    }
}