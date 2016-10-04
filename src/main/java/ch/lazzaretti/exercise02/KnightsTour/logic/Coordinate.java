package ch.lazzaretti.exercise02.KnightsTour.logic;

/**
 * Created by flazz on 01.10.2016.
 */
public class Coordinate {
    public int x;
    public int y;

    public Coordinate( int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add(int x, int y){
        this.x += x;
        this.y += y;
    }

    public Coordinate adabtedCoord(int x, int y) {
        Coordinate clone = (Coordinate)this.clone();
        clone.add(x,y);
        return clone;
    }

    @Override public String toString(){
        return "["+x+","+y+"]";
    }
    @Override public Coordinate clone(){
        return new Coordinate(this.x,this.y);
    }
    @Override public boolean equals(Object obj) {
        return obj instanceof Coordinate && ((Coordinate) obj).x == this.x && ((Coordinate) obj).y == this.y;
    }
}
