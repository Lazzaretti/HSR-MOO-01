package exercise02.KnightsTour.logic;

import java.util.ArrayList;

/**
 * Created by flazz on 01.10.2016.
 */
public class Way extends ArrayList<Coordinate> {
    @Override public Way clone(){
        return (Way) super.clone();
    }
}