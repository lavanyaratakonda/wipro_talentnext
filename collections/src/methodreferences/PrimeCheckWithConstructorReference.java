package methodreferences;
import java.util.Scanner;

@FunctionalInterface
interface PrimeChecker {
    void check(int n);
}

class PrimeNumber {
    public PrimeNumber(int n) {
        boolean isPrime = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}

public class PrimeCheckWithConstructorReference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeChecker checker = PrimeNumber::new;

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        checker.check(number);
    }
}