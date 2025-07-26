package functionalInterface;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PerfectSquareFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        Predicate<Integer> isPerfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        List<Integer> perfectSquares = numbers.stream()
                                              .filter(isPerfectSquare)
                                              .collect(Collectors.toList());

        System.out.println("\nPerfect square numbers:");
        perfectSquares.forEach(System.out::println);
    }
}
