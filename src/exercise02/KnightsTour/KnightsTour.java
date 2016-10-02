package exercise02.KnightsTour;

import java.util.ArrayList;

/**
 * Created by flazz on 01.10.2016.
 * Springerproblem
 * https://de.wikipedia.org/wiki/Springerproblem
 */
public class KnightsTour {
    int width, height;
    boolean[][] map;
    Coordinate start;
    boolean onlyFindOneWay = true;

    public KnightsTour(){
        this(2,2);
    }

    public KnightsTour(int startX,int startY){
        this(startX,startY,5,6);
    }

    public KnightsTour(int startX,int startY,int mapWidth,int mapHeight){
        start = new Coordinate(startX, startY);
        this.width = mapWidth;
        this.height = mapHeight;
        map = new boolean[mapWidth][mapHeight];
    }

    public  Ways find(){
        Way way = new Way();
        return find(start, way.clone());
    }

    protected  Ways find(Coordinate position, Way way){
        if(way.size()!=0){//don't do the finished check on start
            if (position.equals(start)){
                for(int x=0;x<width;x++){
                    for (int y=0;y<height;y++){
                        if(!map[x][y]){
                            return null;
                        }
                    }
                }
                //all fields are visited
                Ways foundWay = new Ways();
                foundWay.add(way);
                return foundWay;
            }
        }
        if (!possiblePosition(position)){
            return null;
        }
        way.add(position);
        map[position.x][position.y] = true;

        Ways realWays;
        if(onlyFindOneWay){
            realWays = findWay(position, way);
        }else {
            realWays = findWays(position, way);
        }

        map[position.x][position.y] = false;
        return realWays;
    }

    protected Ways findWays(Coordinate position,Way way){
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

    protected Ways findWay(Coordinate position,Way way){
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

    protected boolean possiblePosition(Coordinate position){
        if (position.x < 0 || position.y < 0 || position.x >= width || position.y >= height ){
            return false;
        }else if (map[position.x][position.y]){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args){
        KnightsTour tour = new KnightsTour();
        System.out.println(tour.find().toString());
    }
}