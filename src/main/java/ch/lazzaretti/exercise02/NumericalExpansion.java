package ch.lazzaretti.exercise02;


public class NumericalExpansion {

    public static void main(String[] args){

        int i = 1;
        long l = 2;
        float f =.1f;
        double d = 0.2;

        float x1 = i / 4;//=0
        double x2 = i / 4.0;//=0.25
        float x3 = 1.0f / l;//=0.5
        double y1 = 123456789 + f;  //=1.23456792E8 , 0x1.d6f346p26
        double y2 = 123456789.0 + f;//=1.23456792E8
        long z1 = Integer.MAX_VALUE + i;//=2147483647+1 = -2147483648 = Integer.MIN_VALUE
        long z1b = (long) Integer.MAX_VALUE + i;//2147483648
        long z2 = Integer.MAX_VALUE * 2;//-2 --> Integer.MAX_VALUE = 2^31-1 --> Integer.MAX_VALUE +1 == -Integer.MIN_VALUE
        //float z3 = i / 0; //  java.lang.ArithmeticException: / by zero
        float z3 = i / 0f;//=Float.POSITIVE_INFINITY
        Float.isInfinite(z3);//=true
        float z3b = z3*-1;//=Float.NEGATIVE_INFINITY

    }

}
