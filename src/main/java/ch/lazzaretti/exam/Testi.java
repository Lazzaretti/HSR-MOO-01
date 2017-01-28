package ch.lazzaretti.exam;

/**
 * Created by fab on 11.01.2017.
 */
public class Testi {
    public static void main(String args[]){
        /*Double d = 1.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001;
        System.out.print((d - 1.0) / (d - 1.0));//*/
        int a = 0,b=0,c=0;
        boolean d = (a++>0 && b-- <0)||--c<0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
