package exercise02.KnightsTour.logic;

/**
 * Created by flazz on 01.10.2016.
 * Springerproblem
 * https://de.wikipedia.org/wiki/Springerproblem
 */
public class KnightsTourFindAllWays extends KnightsTour {

    public KnightsTourFindAllWays(){
        super();
    }

    public KnightsTourFindAllWays(int startX, int startY){
        super(startX,startY);
    }

    public KnightsTourFindAllWays(int startX, int startY, int mapWidth, int mapHeight){
        super(startX,startY,mapWidth,mapHeight);
    }

    protected Ways findWay(Coordinate position, Way way){
        Ways wayArr[] = new Ways[8];
        wayArr[0] = find(position.adabtedCoord(1,2),way.clone());
        wayArr[1] = find(position.adabtedCoord(2,1),way.clone());
        wayArr[2] = find(position.adabtedCoord(2,-1),way.clone());
        wayArr[3] = find(position.adabtedCoord(1,-2),way.clone());
        wayArr[4] = find(position.adabtedCoord(-1,-2),way.clone());
        wayArr[5] = find(position.adabtedCoord(-2,-1),way.clone());
        wayArr[6] = find(position.adabtedCoord(-2,1),way.clone());
        wayArr[7] = find(position.adabtedCoord(-1,2),way.clone());

        Ways realWays = new Ways();
        for (Ways ways : wayArr) {
            if(ways!=null){
                for(Way foundWay:ways ) {
                    if (foundWay != null) {//unnecessary?
                        realWays.add(foundWay);
                    }
                }
            }
        }
        return realWays;
    }
}