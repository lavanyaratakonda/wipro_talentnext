package stringBuffer;
import java.util.Scanner;

public class Leftright {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' || 
               (i > 0 && str.charAt(i - 1) == '*') || 
               (i < str.length() - 1 && str.charAt(i + 1) == '*')) {
                continue;
            }
            result.append(str.charAt(i));
        }
        System.out.println(result.toString());
    }
}