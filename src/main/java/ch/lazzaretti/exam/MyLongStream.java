package ch.lazzaretti.exam;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by flazz on 15.07.2017.
 */
public class MyLongStream {

    public static void main(String[] args) {
        //IntStream.generate((new Random())::nextInt).limit(10).map(i -> -i).sorted().map(i -> -i).forEach(System.out::println);
        IntStream.generate((new Random())::nextInt).limit(10).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
