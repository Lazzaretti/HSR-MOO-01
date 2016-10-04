package ch.lazzaretti.exercise02.KnightsTour;

import ch.lazzaretti.exercise02.KnightsTour.logic.KnightsTour;
import ch.lazzaretti.exercise02.KnightsTour.logic.KnightsTourFindAWay;
import ch.lazzaretti.exercise02.KnightsTour.logic.KnightsTourFindAllWays;

import java.util.Scanner;

/**
 * Created by flazz on 02.10.2016.
 */
public class ConsoleExecuter {

    public static void main(String[] args){
        System.out.println("Do you want to get all or one Way?(a/o)");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        KnightsTour tour;
        switch (string){
            case "a":
                tour = new KnightsTourFindAllWays();
                break;
            case "o":
                tour = new KnightsTourFindAWay();
                break;
            default:
                System.out.println("Wrong input");
                return;
        }

        System.out.println(tour.find().toString());
    }

}
