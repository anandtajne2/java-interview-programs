package numbers;

import java.util.Scanner;

public class NumberStringPalindrom {

	public static void main(String[] args) {
		String orignal, reverse = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		orignal = scanner.nextLine();
		int length = orignal.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + orignal.charAt(i);
		}
		if (orignal.equals(reverse)) {
			System.out.println("Entered string/number is a palindrome.");
		} else {
			System.out.println("Entered string/number isn't a palindrome.");
		}
	}
}