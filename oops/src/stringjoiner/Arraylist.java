package stringjoiner;

import java.util.*;
class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }
        StringJoiner sj = new StringJoiner(",", "{", "}");
        names.forEach(sj::add);
        System.out.println(sj.toString());
    }
}
