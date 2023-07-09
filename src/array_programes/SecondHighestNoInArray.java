package array_programes;

import java.util.Arrays;

public class SecondHighestNoInArray {

	public static void main(String[] args) {
		int[] arr = { 5, 6, -3, 9, -25, 234, 7, 2, 0 };

		int highest = arr[0];
		int secondHighest = arr[0];

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			} else if (arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("second highest no : " + secondHighest);
	}
}