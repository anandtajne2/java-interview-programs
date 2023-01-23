package string;

import java.util.Arrays;

// anagram means given string build by the same characters

public class AnagramString {

	public static void main(String[] args) {
		String str1 = "army";
		String str2 = "mary";
		// conver string to char array in lowe case or upper case to match exact
		// characters
		char[] array1 = str1.toLowerCase().toCharArray();
		char[] array2 = str2.toLowerCase().toCharArray();
		// sort the character array to exact sequence to match
		Arrays.sort(array1);
		Arrays.sort(array2);
		// to check the arrays are equals or not
		if (Arrays.equals(array1, array2)) {
			System.out.println("given string is anagram");
		} else {
			System.out.println("given string is NOT anagram");
		}
	}
}