package stringBuffer;

import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String part = str.length() >= 2 ? str.substring(0, 2) : str;
        String result = "";
        for (int i = 0; i < n; i++) {
            result += part;
        }
        System.out.println(result);
    }
}
