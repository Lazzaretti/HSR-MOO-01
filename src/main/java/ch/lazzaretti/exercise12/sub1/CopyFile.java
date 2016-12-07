package ch.lazzaretti.exercise12.sub1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by fab on 07.12.2016.
 */
public class CopyFile {

    public static final String DEFAULT_INPUT = "./DATA/people.csv";
    public static final String DEFAULT_OUTPUT = "./out/peoplecopy.csv";

    public static void copy(String input, String output) throws IOException{
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(input);

            fileWriter = new FileWriter(output);

            int value = fileReader.read();
            while (value >= 0) {
                fileWriter.write(value);
                value = fileReader.read();
            }
        }finally {
            if(fileReader != null){
                fileReader.close();
            }
            if(fileWriter != null){
                fileWriter.close();
            }
        }
    }

    public static void copyBuffered(String input, String output) throws IOException{
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));
            ) {
            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
        }
    }

    public static void main(String[] args){
        System.out.println("CopyFile");
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to copy: ("+DEFAULT_INPUT+")");
        String input = scanner.nextLine();
        if("".equals(input)){
            input=DEFAULT_INPUT;
        }
        System.out.println("File to save: ("+DEFAULT_OUTPUT+")");
        String output = scanner.nextLine();
        if("".equals(output)){
            output = DEFAULT_OUTPUT;
        }
        try {
            copyBuffered(input, output);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
