package numbers;

public class ReverseInteger {

	public static void main(String[] args) {
		long no = 12345678, rev = 0;
		while (no != 0) {
			rev = rev * 10 + no % 10;
			no = no / 10;
		}
		System.out.println("reverse no : " + rev);

		// 2nd logic using string buffer / string builder

		long number = 12345678;
		System.out.println("using string builder : " + new StringBuilder(String.valueOf(number)).reverse());
	}
	
}