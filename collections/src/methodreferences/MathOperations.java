package methodreferences;
import java.util.Scanner;

@FunctionalInterface
interface FactorialCalculator {
    int calculate(int n);
}

class MathOperations {
    public int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations mathOps = new MathOperations();
        FactorialCalculator calculator = mathOps::factorial;

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.println("Factorial: " + calculator.calculate(number));
    }
}