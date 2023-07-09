package string_programes;

public class CountGivenRepeatedCharInString {

	public static void main(String[] args) {
		String str = "Swiss";
		int result = str.length() - str.replaceAll("s", "").length();
		System.out.println("result : " + result);
	}

}
