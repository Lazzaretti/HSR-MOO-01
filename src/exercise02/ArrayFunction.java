package exercise02;


import java.util.Arrays;

/**
 * Created by Fabrizio on 27/09/2016.
 */
public class ArrayFunction {

    public static int[] revert(int[] arr){
        int[] rev = new int[ arr.length ];
        for(int i=0; i<arr.length;i++){
            rev[arr.length-i-1] = arr[i];
        }
        return rev;
    }

    /**
     * Sortieren von klein nach gross
     * Vorgehen:
     *  1. Es wird ein Eintrag nach dem Anderen des Arrays genommen
     *  2. Es wird geschaut, ob ein kleinerer Eintrag im Array existiert
     *  3. Der kleinste Eintrag wird in die nächstfreie Stelle des Ausgabearray geschrieben
     * @param arr
     * @return array sorted
     */
    public static int[] sortAscending(int[] arr){
        Integer[] array = new Integer[arr.length];
        for(int i=0; i<arr.length;i++) {
             array[i] = arr[i];
        }
        int[] sort = new int[ array.length ];
        int empty = array.length;
        int i=0;
        while (empty>0){
            if(array[i]!=null) {
                Integer smallest = array[i];
                int smallestIndex = i;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != null && smallest.intValue() > array[j].intValue()) {
                        smallest = array[j];
                        smallestIndex = j;
                    }
                }
                array[smallestIndex] = null;
                sort[array.length-empty] = smallest;
                empty--;
            }
            i=++i%array.length;
        }
        return sort;
    }

    public static boolean isSame(int[] arr, int[] other){
        for (int i=0; i<arr.length;i++){
            if(arr[i]!=other[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * Ascending Array herstellen, anschliessend vergleichen
     * @param arr
     * @return
     */
    public static boolean ascendinglySorted(int[] arr){
        int[] asc = sortAscending(arr);
        return isSame(arr,asc);
    }

    /**
     * Descending Array herstellen, anschliessend vergleichen
     * @param arr
     * @return
     */
    public static boolean descendinglySorted(int[] arr){
        int[] desc = revert(sortAscending(arr));
        return isSame(arr,desc);
    }

    public static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        print(new int[]{1,2,3});
    }
}
