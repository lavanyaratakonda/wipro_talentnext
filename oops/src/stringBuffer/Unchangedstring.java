package stringBuffer;
import java.util.Scanner;

public class Unchangedstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        System.out.println(str);
    }
}