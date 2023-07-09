package string_programes;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String str1 = "mary";
		String str2 = "army";

		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("String is Anagrame");
		} else {
			System.out.println("String is NOT Anagrame");
		}

	}

}
