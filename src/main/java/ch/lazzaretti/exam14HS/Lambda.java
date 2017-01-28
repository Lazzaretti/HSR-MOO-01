package ch.lazzaretti.exam14HS;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by fab on 23.01.2017.
 */
public class Lambda {

    static <T extends Collection<? extends U>,U> void myFunc(Comparator<T,U> comparator){

    }

    public static void main(String[] args) {
        myFunc((a,b)->a.contains(b));
    }
}

@FunctionalInterface
interface Comparator<T extends Collection<? extends U>,U>{
    boolean comparate(T first, U second);
}