package list;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + "]";
    }

    public static void main(String[] args) {
        Vector<Employee> employeeVector = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter employee details (ID and Name). Type 'done' when finished:");
        
        while(true) {
            System.out.print("Enter employee ID (or 'done' to finish): ");
            String input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("done")) {
                break;
            }
            
            try {
                int id = Integer.parseInt(input);
                System.out.print("Enter employee name: ");
                String name = scanner.nextLine();
                
                employeeVector.add(new Employee(id, name));
            } catch(NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a number.");
            }
        }
        
        // Display using Iterator
        System.out.println("\nEmployees using Iterator:");
        Iterator<Employee> iterator = employeeVector.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Display using Enumeration
        System.out.println("\nEmployees using Enumeration:");
        Enumeration<Employee> enumeration = employeeVector.elements();
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        
        scanner.close();
    }
}