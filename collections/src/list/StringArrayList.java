package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
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

    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}