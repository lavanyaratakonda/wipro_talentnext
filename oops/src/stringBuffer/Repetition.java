package stringBuffer;
import java.util.*;

public class Repetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string and integer separated by comma:");
        String input = scanner.nextLine();
        
        String[] parts = input.split(",");
        if (parts.length != 2) {
            System.out.println("Invalid input format. Please enter string and integer separated by comma.");
            return;
        }
        
        String str = parts[0];
        int n = Integer.parseInt(parts[1]);
        
        if (n < 0 || n > str.length()) {
            System.out.println("Invalid value of n. It should be between 0 and string length.");
            return;
        }
        
        String lastNChars = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        
        System.out.println(result.toString());
    }
}