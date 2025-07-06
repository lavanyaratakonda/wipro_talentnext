package arrays;

import java.util.Scanner;

public class ArrayQ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the number to search: ");
		int search = sc.nextInt();

		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				index = i;
				break;
			}
		}

		System.out.println("Output: " + index);

		sc.close();
	}
}
