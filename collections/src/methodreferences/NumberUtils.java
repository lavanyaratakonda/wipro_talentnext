package methodreferences;
import java.util.Scanner;

@FunctionalInterface
interface DigitCounter {
    int count(int n);
}

class NumberUtils {
    public static int digitCount(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DigitCounter counter = NumberUtils::digitCount;

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.println("Number of digits: " + counter.count(number));
    }
}