package arrays;

import java.util.*;

public class ArrayQ5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = scanner.nextInt();

		if (n < 2) {
			System.out.println("Need at least 2 elements.");
			return;
		}

		int[] arr = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num > max1) {
				max2 = max1;
				max1 = num;
			} else if (num > max2 && num != max1) {
				max2 = num;
			}

			if (num < min1) {
				min2 = min1;
				min1 = num;
			} else if (num < min2 && num != min1) {
				min2 = num;
			}
		}

		System.out.println("Smallest 2 numbers: " + min1 + ", " + min2);
		System.out.println("Largest 2 numbers: " + max1 + ", " + max2);
	}
}