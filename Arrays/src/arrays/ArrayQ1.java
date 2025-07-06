package arrays;

import java.util.Scanner;

public class ArrayQ1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		int sum = 0;

		System.out.println("Enter " + n + " integer elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		double average = (double) sum / n;

		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);

		sc.close();
	}
}
