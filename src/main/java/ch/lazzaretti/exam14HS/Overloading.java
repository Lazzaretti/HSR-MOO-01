package ch.lazzaretti.exam14HS;

/**
 * Created by fab on 23.01.2017.
 */
public class Overloading {
    public static int round(int x){
        return x;
    }
    public static double round(double x){
        return x;
    }
    public static Integer round(Integer x){
        return x;
    }
    public static void main(String[] args) {
        double r = round(2);
        int i = round(2);
        double j = round(2.0);
        Integer k = round(1);
        round(null);
    }
}
