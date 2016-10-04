package ch.lazzaretti.exercise01;

import java.util.Scanner;

public class FactorialDouble {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        FactorialDouble factorial = new FactorialDouble();

        try{
            System.out.println(factorial.getFactorialDouble(number));
        }catch (Exception e){
            System.out.println(e.toString());
        }

        scanner.close();
    }

    public int getFactorialDouble(int number) throws Exception {

        if (number < 0) {
            throw new Exception("Undefined");
        } else if (12 < number) {
            throw new Exception("To large");
        }

        int product = 1;
        int factor = 2-number%2;//2 oder 1

        while(factor<=number) {
            product *= factor;
            factor+=2;
        }

        return product;
    }
}
