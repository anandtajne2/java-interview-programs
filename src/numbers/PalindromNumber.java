package numbers;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		int a, no, b, temp = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any num : ");
		no = scanner.nextInt();
		b = no;
		while (no != 0) {
			a = no % 10;
			no = no / 10;
			temp = temp * 10 + a;
		}
		if (temp == b) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}