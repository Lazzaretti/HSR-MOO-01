package ch.lazzaretti.exercise02;

/**
 * Created by flazz on 01.10.2016.
 */
public class Overloading {
    static int calculate(int i) { return i; }
    static float calculate(int x, float y) { return y; }
    static float calculate(float x, int y) { return x; }
    static double calculate(double x, double y) { return y; }

    public static void main(String[] args){
        //int a = calculate(2.0);
        float b = calculate(1, 2.0f);
        //float c = calculate(1, 2);
        double d = calculate(1.0f, 2.0f);//float to double
        double e = calculate(1.0, 2.0f);//int/float to double
        double f = calculate(1L, 2);//long to float
    }
}
