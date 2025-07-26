package functionalInterface;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class PalindromeFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter 10 words:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            words.add(sc.nextLine());
        }

        Predicate<String> isPalindrome = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
        List<String> result = words.stream().filter(isPalindrome).collect(Collectors.toList());

        System.out.println("\nPalindrome words:");
        result.forEach(System.out::println);
    }
}
