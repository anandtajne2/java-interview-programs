package numbers;

import java.util.Arrays;

public class SecondHighestNoInArray2 {

	public static void main(String[] args) {
		int[] array = { 3, 5, 16, 9, 12, 89, 88, 97 };
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}