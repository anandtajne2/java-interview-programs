package numbers;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int x, y, t;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number");
		x = scanner.nextInt();
		y = scanner.nextInt();
		System.out.println("before swaping number : " + "x " + x + " y " + y);
		//swaping 
		t=x;
		x=y;
		y=t;
		System.out.println("after  swaping number : " + "x " + x + " y " + y);
	}

}