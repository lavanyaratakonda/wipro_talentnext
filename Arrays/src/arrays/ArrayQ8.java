package arrays;

import java.util.Scanner;

public class ArrayQ8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        boolean skip = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                skip = true;
            } else if (arr[i] == 7 && skip) {
                skip = false;
            } else if (!skip) {
                sum += arr[i];
            }
        }
        System.out.println("Sum = " + sum);
    }
}
