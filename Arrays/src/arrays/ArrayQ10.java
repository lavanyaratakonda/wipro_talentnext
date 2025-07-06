package arrays;

import java.util.*;

public class ArrayQ10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " integer elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] result = evenOdd(arr);
		System.out.println("Rearranged array: " + Arrays.toString(result));

		sc.close();
	}

	public static int[] evenOdd(int[] nums) {
		int[] result = new int[nums.length];
		int evenIndex = 0;
		int oddIndex = nums.length - 1;

		for (int num : nums) {
			if (num % 2 == 0) {
				result[evenIndex++] = num;
			} else {
				result[oddIndex--] = num;
			}
		}

		return result;
	}
}
