package ch.lazzaretti.exercise10.sub2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by fab on 23.11.2016.
 */
public class Search {
    public static <T> List<T> search(List<T> input, Predicate<T>... filter){
        ArrayList<T> out = new ArrayList<T>();
        for(T item:input){
            boolean accepted = true;
            for (Predicate<T> f:filter){
                if(!f.test(item)){
                    accepted = false;
                    break;
                }
            }
            if (accepted){
                out.add(item);
            }
        }
        return out;
    }
}
