package arrays;

import java.util.Scanner;

public class ArrayQ9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int[] result = new int[n];
		int index = 0;
		for (int num : arr) {
			if (num != 10) {
				result[index++] = num;
			}
		}
		for (int value : result) {
			System.out.print(value + " ");
		}
	}
}
