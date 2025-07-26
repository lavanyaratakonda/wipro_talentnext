package streamAPI;

import java.util.*;
import java.util.stream.*;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String toString() {
        return empNo + " " + name + " " + age + " " + location;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int empNo = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());
            String location = sc.nextLine();
            list.add(new Employee(empNo, name, age, location));
        }
        List<Employee> filtered = list.stream().filter(e -> e.location.equalsIgnoreCase("Pune")).collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}
