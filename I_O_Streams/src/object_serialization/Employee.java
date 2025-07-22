package object_serialization;

import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee() {}

    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() { return name; }
    public Date getDateOfBirth() { return dateOfBirth; }
    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setDepartment(String department) { this.department = department; }
    public void setDesignation(String designation) { this.designation = designation; }
    public void setSalary(double salary) { this.salary = salary; }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", new Date(), "IT", "Developer", 50000.0);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
            oos.writeObject(emp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
            Employee readEmp = (Employee) ois.readObject();
            System.out.println("Name: " + readEmp.getName());
            System.out.println("DOB: " + readEmp.getDateOfBirth());
            System.out.println("Department: " + readEmp.getDepartment());
            System.out.println("Designation: " + readEmp.getDesignation());
            System.out.println("Salary: " + readEmp.getSalary());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
