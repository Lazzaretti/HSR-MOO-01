package ch.lazzaretti.exercise01;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Factorial factorial = new Factorial();

        try{
            System.out.println(factorial.getFactorial(number));
        }catch (Exception e){
            System.out.println(e.toString());
        }

        scanner.close();
    }

    public int getFactorial(int number) throws Exception {

        if (number < 0) {
            throw new Exception("Undefined");
        } else if (12 < number) {
            throw new Exception("To large");
        }

        int product = 1;

        for (int i = 1; i <= number; i++) {
            product *= i;
        }

        return product;
    }
}
