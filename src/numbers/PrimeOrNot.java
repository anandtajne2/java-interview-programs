package numbers;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int no, i, fect = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = scanner.nextInt();
		if (no == 1) {
			System.out.println("smallest prime number is 2");
		}
		for (int j = 2; j < no; j++) {
			if (no % j == 0) {
				System.out.println("not a prime no");
				break;
			}
			if (no == j) {
				System.out.println("prime no ");
			}
		}
	}

}
