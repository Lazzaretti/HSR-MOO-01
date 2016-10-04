package ch.lazzaretti.exercise02;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by flazz on 27.09.2016.
 */
public class RecursiveSum {
    public static void main(String[] args) {
        int[] series = randomSeries(1000);

        System.out.println(getSum(series));
    }

    public static int getSum(int[] series){
        switch (series.length){
            case 0:
                return 0;
            case 1:
                return series[0];
            default:
                return series[0] + getSum(Arrays.copyOfRange(series,1,series.length));
        }
    }

    static int[] randomSeries(int amount) {
        Random random = new Random(4711);
        int[] series = new int[amount];
        for (int index = 0; index < amount; index++) {
            series[index] = random.nextInt(10);
        }
        return series;
    }
}
