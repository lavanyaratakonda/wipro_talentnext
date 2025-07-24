package list;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberArrayList {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                if (input.contains(".")) {
                    numberList.add(Double.parseDouble(input));
                } else {
                    numberList.add(Integer.parseInt(input));
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please try again");
            }
        }
    }
}