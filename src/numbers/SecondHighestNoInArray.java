package numbers;

import java.util.Arrays;

public class SecondHighestNoInArray {

	public static void main(String[] args) {

		int[] array = { 3, 5, 16, 9, 12, 89, 88 };

		int n = array.length;

		// sort of array
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (array[i] > highest) {
				secondHighest = highest;
				highest = array[i];
			}
			if (array[i] < highest && array[i] > secondHighest) {
				secondHighest = array[i];
			}
		}
		System.out.println("second highest number " + secondHighest);

		// System.out.println("second highest number : " + array[n - 2]);

	}
}