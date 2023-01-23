package string;

public class ReverseString {

	public static void main(String[] args) {

		// logic 1 without using method
		String string = "selenium";
		int len = string.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}
		System.out.println("reverse string : " + rev);

		// logic 2 using string buffere / string builder
		
		StringBuilder builder = new StringBuilder(string);
		System.out.println("reverse string using string builder : "+builder.reverse());
		
	}

}

