package ch.lazzaretti.exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        PrimeNumber prime = new PrimeNumber();

        try{
            System.out.println(prime.isPrimeNumber(number)?"Yes":"No");
        }catch (Exception e){
            System.out.println(e.toString());
        }
        
        System.out.println(prime.getPrimeNumbers(100).toString());

        scanner.close();
    }

    public boolean isPrimeNumber(int number) throws Exception {

        if (50 < number) {
            throw new Exception("To large");
        }
        
        if(number<2){
        	return false;
        }

        for(int i=2;i<number;i++){
        	if(number%i==0)
        		return false;
        }
        return true;
    }
    
    public ArrayList<Integer> getPrimeNumbers(int count){
    	ArrayList<Integer> numbers = new ArrayList<Integer>(); 
		int i=2;
    	while(numbers.size()<count){
    		Boolean isPrim = true;
    		for(Integer prime : numbers){
    			if(i%prime==0){
    				isPrim = false;
    				break;
    			}
    		}
    		if(isPrim){
    			numbers.add(new Integer(i));
    		}
    		i++;
    		
    	}
    	return numbers;
    }
}
