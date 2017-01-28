package ch.lazzaretti.exam14HS;

/**
 * Created by fab on 23.01.2017.
 */
public class Transponator {
    public static int[][] transponate(int[][] a){
        if (a==null){
            throw new IllegalArgumentException();
        }
        int[][] r = new int[a[0].length][a.length];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++) {
                r[j][i] = a[i][j];
            }
        }
        return r;
    }
}