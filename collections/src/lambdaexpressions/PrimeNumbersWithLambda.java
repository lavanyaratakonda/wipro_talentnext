package lambdaexpressions;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PrimeNumbersWithLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        
        System.out.println("Enter 25 random numbers:");
        for (int i = 0; i < 25; i++) {
            al.add(scanner.nextInt());
        }

        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println("Prime numbers in the ArrayList:");
        al.stream().filter(isPrime).forEach(System.out::println);
    }
}