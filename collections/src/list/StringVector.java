package list;

import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;

public class StringVector {
    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter strings (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            stringVector.add(input);
        }
        
        printAll(stringVector);
    }

    public static void printAll(Vector<String> vector) {
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}