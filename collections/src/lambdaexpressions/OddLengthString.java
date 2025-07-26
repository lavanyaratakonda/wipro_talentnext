package lambdaexpressions;
import java.util.ArrayList;
import java.util.Scanner;

public class OddLengthString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        
        System.out.println("Enter 10 different words:");
        for (int i = 0; i < 10; i++) {
            al.add(scanner.next());
        }

        System.out.println("Strings with odd length:");
        al.stream().filter(s -> s.length() % 2 != 0).forEach(System.out::println);
    }
}