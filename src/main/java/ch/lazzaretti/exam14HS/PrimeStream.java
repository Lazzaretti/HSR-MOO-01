package ch.lazzaretti.exam14HS;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by fab on 23.01.2017.
 */
public class PrimeStream {
    public static void main(String[] args) {

        long[] a = LongStream.of(2,5,7,11).toArray();
        long[] r =new long[a.length];
        for (int i=0;i<a.length;i++){
            r[a.length-i-1] = a[i];
        }
        for (int i=0;i<a.length;i++) {
            System.out.println(r[i]);
        }
        //LongStream.iterate(2,i -> i+1).filter(i->i%2==0).filter(i-> i< 20).forEach(System.out::println);
        Stream.of(1,2,3).filter(i->i%2==0).filter(i-> i< 20).sorted(java.util.Comparator.reverseOrder());
    }
}
