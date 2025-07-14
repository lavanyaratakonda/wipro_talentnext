package stringBuffer;
import java.util.Scanner;

public class Newstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() > 2) {
            System.out.println(str.substring(1, str.length() - 1));
        } else {
            System.out.println("");
        }
    }
}
