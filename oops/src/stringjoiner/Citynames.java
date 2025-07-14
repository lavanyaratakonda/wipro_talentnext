package stringjoiner;

import java.util.*;

public class Citynames{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        StringJoiner s1 = new StringJoiner("-");
        for (int i = 0; i < n1; i++) {
            s1.add(sc.nextLine());
        }

        int n2 = Integer.parseInt(sc.nextLine());
        StringJoiner s2 = new StringJoiner("-");
        for (int i = 0; i < n2; i++) {
            s2.add(sc.nextLine());
        }

        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s1);
        merge1.merge(s2);
        System.out.println("s1 merged to s2: " + merge1);

        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s2);
        merge2.merge(s1);
        System.out.println("s2 merged to s1: " + merge2);
    }
}
