package numebr_programes;

public class NumberIsPalindrom {

	public static void main(String[] args) {
		int no = 949, rev = 0;
		int temp = no;
		while (no != 0) {
			int reminder = no % 10;
			rev = rev * 10 + reminder;
			no = no / 10;
		}
		if (temp == rev) {
			System.out.println("Number is Palindrom");
		} else {
			System.out.println("Number is NOT Palindrom");
		}
	}

}
