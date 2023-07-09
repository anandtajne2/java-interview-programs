package numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int no, fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = scanner.nextInt();
		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is : " + fact);
	}

}
