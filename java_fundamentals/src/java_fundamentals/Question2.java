package java_fundamentals;


import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String Name = sc.nextLine();
        if (args.length >= 0) {
            System.out.println("Welcome "+Name);
        } else {
            System.out.println("No name provided.");
        }
        
    }
}