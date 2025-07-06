package arrays;

import java.util.Scanner;

public class ArrayQ11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " integer elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (only14(arr)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		sc.close();
	}

	public static boolean only14(int[] nums) {
		for (int num : nums) {
			if (num != 1 && num != 4) {
				return false;
			}
		}
		return true;
	}
}
