package stringBuffer;

import java.util.*;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings separated by comma:");
        String input = scanner.nextLine();
        
        String[] parts = input.split(",");
        if (parts.length != 2) {
            System.out.println("Invalid input format. Please enter two strings separated by comma.");
            return;
        }
        
        String a = parts[0];
        String b = parts[1];
        StringBuilder result = new StringBuilder();
        
        int maxLength = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }
        
        System.out.println(result.toString());
    }
}