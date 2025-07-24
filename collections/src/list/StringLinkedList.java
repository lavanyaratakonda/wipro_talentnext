package list;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class StringLinkedList {
    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter strings (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            stringList.add(input);
        }
        
        printAll(stringList);
    }

    public static void printAll(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}