package array_programes;

import java.util.Arrays;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int[] numArray = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum = sum + numArray[i];
		}

		int expectedSum = 0;
		for (int i = 1; i <= 10; i++) {
			expectedSum = expectedSum + i;
		}

		System.out.println("array : " + Arrays.toString(numArray));
		System.out.println("sum : " + sum);
		System.out.println("expeced sum : " + expectedSum);
		System.out.println("Missing number in array : " + (expectedSum - sum));
	}

}
