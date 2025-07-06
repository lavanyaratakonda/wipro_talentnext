package arrays; 
import java.util.Scanner;
public class ArrayQ12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }

        int[] result = {a[1], b[1]};

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}