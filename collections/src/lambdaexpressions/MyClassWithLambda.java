package lambdaexpressions;
import java.util.Scanner;

interface WordCount {
    int count(String str);
}

public class MyClassWithLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordCount wordCount = str -> str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        System.out.println("Word count: " + wordCount.count(input));
    }
}