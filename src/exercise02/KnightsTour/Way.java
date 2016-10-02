package exercise02.KnightsTour;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by flazz on 01.10.2016.
 */
public class Way extends ArrayList<Coordinate> {
    @Override public Way clone(){
        return (Way) super.clone();
    }
}