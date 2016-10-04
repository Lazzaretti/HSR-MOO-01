package ch.lazzaretti.exercise02.number8;

/**
 * Created by Fabrizio on 29/09/2016.
 */
public interface CalculatorOverloading {
    int calculate(int i);
    float calculate(int x, float y);
    float calculate(float x, int y);
    double calculate(double x, double y);
}
