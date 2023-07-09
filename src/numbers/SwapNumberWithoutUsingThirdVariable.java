package numbers;

import java.util.Scanner;

public class SwapNumberWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int x, y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number");
		x = scanner.nextInt();
		y = scanner.nextInt();
		System.out.println("before swaping number : " + "x " + x + " y " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("after  swaping number : " + "x " + x + " y " + y);
	}

}
