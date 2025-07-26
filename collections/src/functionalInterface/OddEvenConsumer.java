package functionalInterface;

import java.util.*;
import java.util.function.Consumer;

public class OddEvenConsumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        Consumer<Integer> displayOddEven = n -> {
            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };

        System.out.println("\nOdd/Even results:");
        numbers.forEach(displayOddEven);
    }
}