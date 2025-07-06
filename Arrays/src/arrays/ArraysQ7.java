package arrays;

import java.util.*;

public class ArraysQ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " integer elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		LinkedHashSet<Integer> unique = new LinkedHashSet<>();
		for (int num : arr) {
			unique.add(num);
		}

		System.out.print("Array after removing duplicates: ");
		for (int num : unique) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}
