package arrays;

import java.util.Scanner;

public class ArrayQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " integer elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		int min = arr[0];

		for (int num : arr) {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}

		System.out.println("Maximum = " + max);
		System.out.println("Minimum = " + min);

		sc.close();
	}
}
