package ch.lazzaretti.exercise02.KnightsTour.logic;

/**
 * Created by flazz on 01.10.2016.
 * Springerproblem
 * https://de.wikipedia.org/wiki/Springerproblem
 */
public abstract class KnightsTour {
    int width, height;
    boolean[][] map;
    Coordinate start;

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

    public KnightsTour(Settings settings){
        this(settings.start.x,settings.start.y, settings.width,settings.height);
    }

    public Ways find(){
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

        Ways realWays = findWay(position, way);

        map[position.x][position.y] = false;
        return realWays;
    }

    protected abstract Ways findWay(Coordinate position,Way way);

    protected boolean possiblePosition(Coordinate position){
        if (position.x < 0 || position.y < 0 || position.x >= width || position.y >= height ){
            return false;
        }else if (map[position.x][position.y]){
            return false;
        }else {
            return true;
        }
    }
}