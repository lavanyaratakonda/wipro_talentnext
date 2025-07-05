package java_fundamentals;
import java.util.Scanner;

public class Question5 {

	

		public static void main(String args[]) {
			Scanner Sc = new Scanner(System.in);
			int a = Sc.nextInt();
			int b = Sc.nextInt();
			if((a%10)==(b%10)) {
				System.out.println("true");
			}else {
				System.out.println("flase");
			}
		}

	}
