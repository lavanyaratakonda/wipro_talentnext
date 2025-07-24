package set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeNames {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee names (type 'exit' to stop):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            employees.add(name);
        }

        System.out.println("Retrieving employee names:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}