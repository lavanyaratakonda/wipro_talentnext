package list;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeLinkedList {
    // Employee class definition
    static class Employee {
        private String name;
        
        public Employee(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        // Create LinkedList to store employees
        LinkedList<Employee> employeeList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Input employee names
        System.out.println("Enter employee names (type 'done' to finish):");
        while (true) {
            System.out.print("Employee name: ");
            String name = scanner.nextLine();
            
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            
            if (!name.trim().isEmpty()) {
                employeeList.add(new Employee(name));
            }
        }

        // Print using Iterator
        System.out.println("\nEmployees List:");
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            System.out.println("Employee: " + emp.getName());
        }
        
        // Close scanner
        scanner.close();
    }
}