package streamAPI;

import java.util.*;
import java.util.stream.*;

class Student {
    int rollNo;
    String name;
    int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int rollNo = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int mark = Integer.parseInt(sc.nextLine());
            list.add(new Student(rollNo, name, mark));
        }
        long count = list.stream().filter(s -> s.mark >= 50).count();
        System.out.println(count);
    }
}
