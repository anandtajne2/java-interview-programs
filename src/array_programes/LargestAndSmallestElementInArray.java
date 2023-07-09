package array_programes;

import java.util.Arrays;

public class LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 5, 6, -3, 9, -25, 234, 7, 2, 0 };

		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("the largest element is : " + largest);
		System.out.println("the smallest element is : " + smallest);
	}
}