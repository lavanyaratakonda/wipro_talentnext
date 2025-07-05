package java_fundamentals;
import java.util.Scanner;

public class Question4 {
	public static void main(String args[]) {
				Scanner Sc = new Scanner(System.in);
				int n = Sc.nextInt();
				if (n>0) {
					System.out.println("This is a positive number");
				}else if (n<0){
					System.out.println("This is a Negative number");
				}else if(n==0){
					System.out.println("This is zero");
				}
			}

		}
