package lambdaexpressions;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseStringsWithLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        
        System.out.println("Enter 10 different words:");
        for (int i = 0; i < 10; i++) {
            al.add(scanner.next());
        }

        System.out.println("Strings in reverse order:");
        al.forEach(s -> System.out.println(new StringBuilder(s).reverse().toString()));
    }
}