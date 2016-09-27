package exercise02;

/**
 * Created by flazz on 27.09.2016.
 */
public class WordGenerator {

    public static void generateWord(String str, int additionalSize){
        if(additionalSize==0){
            System.out.println(str);
            return;
        }
        for(char c = 'A'; c <= 'Z'; c++){
            generateWord(str+c,additionalSize-1);
        }
    }

    public static void generateWord(int size){
        generateWord("",size);
    }

    public static void main(String[] args){
        generateWord(5);
    }

}
