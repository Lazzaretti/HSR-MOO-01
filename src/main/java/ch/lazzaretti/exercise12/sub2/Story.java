package ch.lazzaretti.exercise12.sub2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by fab on 07.12.2016.
 */
public class Story {

    public static final String DEFAULT_INPUT = "./data/story.txt";

    public static TreeMap<Integer,String> readStroyFile(String file) throws IOException {
        TreeMap<Integer,String> story = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null){
                String[] vals = line.split("=");
                if(vals.length != 2){
                    throw new IOException("Wrong line in file");
                }
                Integer number = Integer.valueOf(vals[0]);
                story.put(number,vals[1]);
                line = reader.readLine();
            }
        }
        return story;
    }

    public static String reconstractStory(Map<Integer,String> story){
        StringBuffer s = new StringBuffer();
        for(int i=0;;i++) {
            String word = story.get(i);
            if (word==null){
                break;
            }
            s.append(word);
            s.append(" ");
        }
        return s.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("CopyFile");
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to copy: ("+DEFAULT_INPUT+")");
        String input = scanner.nextLine();
        if("".equals(input)){
            input=DEFAULT_INPUT;
        }
        TreeMap<Integer,String> story = readStroyFile(input);
        String finalStory = reconstractStory(story);

        System.out.println(finalStory);
    }

}
