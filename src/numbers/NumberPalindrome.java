package numbers;

public class NumberPalindrome {

	public static void main(String[] args) {
		int reverse, sum = 0, temp;
		int n = 454;

		temp = n;
		while (n != 0) {
			reverse = n % 10;
			sum = sum * 10 + reverse;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is NOT palindrome");
		}
	}
}