package functionalInterface;

import java.util.*;
import java.util.function.Function;

public class SumUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        Function<List<Integer>, Integer> sumFunction = l -> l.stream().mapToInt(Integer::intValue).sum();
        int sum = sumFunction.apply(list);

        System.out.println("Sum of numbers: " + sum);
    }
}
