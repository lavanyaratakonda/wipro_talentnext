package functionalInterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Location: ");
            String location = sc.nextLine();

            System.out.print("Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            list.add(new Employee(id, name, location, salary));
        }

        Function<Employee, String> getLocation = e -> e.location;
        List<String> locations = list.stream().map(getLocation).collect(Collectors.toList());

        System.out.println("Employee Locations:");
        locations.forEach(System.out::println);
    }
}
