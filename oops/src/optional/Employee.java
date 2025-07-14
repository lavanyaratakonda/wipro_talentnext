package optional;

import java.util.Optional;
import java.util.Scanner;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

class InvalidEmployeeException extends RuntimeException {
    InvalidEmployeeException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String empName = sc.nextLine();
        Employee emp = empName.equals("null") ? null : new Employee(empName);
        Optional<Employee> opt = Optional.ofNullable(emp);
        Employee result = opt.orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));
        System.out.println(result.name);
    }
}
