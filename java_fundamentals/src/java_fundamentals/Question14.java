package java_fundamentals;
import java.util.*;

public class Question14 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int sum = 0;

	        for (; num != 0; num = num / 10) {
	            int digit = num % 10;
	            sum += digit;
	        }

	        System.out.println("Sum of digits = " + sum);
	        sc.close();
	    }
	}




