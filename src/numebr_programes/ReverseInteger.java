package numebr_programes;

public class ReverseInteger {

	public static void main(String[] args) {
		int no = 9876, result = 0;
		while (no != 0) {
			int reminder = no % 10;
			result = result * 10 + reminder;
			no = no / 10;
		}
		System.out.println("reverse number : " + result);
	}

}
