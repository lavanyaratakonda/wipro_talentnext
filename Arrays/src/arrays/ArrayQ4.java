package arrays;
import java.util.Scanner;
public class ArrayQ4 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of ASCII values: ");
	        int n = sc.nextInt();

	        int[] ascii = new int[n];

	        System.out.println("Enter " + n + " ASCII values:");
	        for (int i = 0; i < n; i++) {
	            ascii[i] = sc.nextInt();
	        }

	        System.out.println("Corresponding characters:");
	        for (int code : ascii) {
	            System.out.print((char) code + " ");
	        }

	        sc.close();
	    }
	}



