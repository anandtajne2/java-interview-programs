package array_programes;

public class FindDublicateNoInArray {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 8, 7, 6, 5, 10, 9 };
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("dublicate : " + arr[j]);
				}
			}
		}
	}

}
