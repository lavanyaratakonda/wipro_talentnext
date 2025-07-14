package stringBuffer;
import java.util.Scanner;

public class Concatenate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            str2 = str2.substring(1);
        }
        System.out.println(str1 + str2);
    }
}

