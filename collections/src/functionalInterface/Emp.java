package functionalInterface;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

class Emp {
    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Emp> list = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            list.add(new Emp(id, name, salary));
        }

        Predicate<Emp> lowSalary = e -> e.getSalary() < 10000;

        System.out.println("\nEmployees with salary less than 10000:");
        list.stream().filter(lowSalary).map(Emp::getName).forEach(System.out::println);
    }
}
