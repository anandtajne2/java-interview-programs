package numbers;

import java.util.Arrays;

public class SecondHighestNoInArray3 {

	public static void main(String[] args) {

		int largest = 0;
		int secondLargest = 0;

		int[] arr = { 9, 2, 1, 60, 47, 59 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("the 2nd largest number is : " + secondLargest);
	}
}