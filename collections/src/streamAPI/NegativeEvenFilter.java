package streamAPI;

import java.util.*;
import java.util.stream.*;

public class NegativeEvenFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        List<Integer> result = list.stream().filter(i -> i < 0 && i % 2 == 0).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
