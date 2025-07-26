package functionalInterface;

import java.util.*;
import java.util.function.Consumer;

public class ReverseWordsConsumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter 10 words:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            words.add(sc.nextLine());
        }

        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String word = list.get(i);
                list.set(i, new StringBuilder(word).reverse().toString());
            }
        };

        reverseWords.accept(words);

        System.out.println("\nReversed words:");
        words.forEach(System.out::println);
    }
}
