package numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 98765, reverse = 0;
		while (number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

}
