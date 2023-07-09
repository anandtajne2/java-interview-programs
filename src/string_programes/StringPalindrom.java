package string_programes;

public class StringPalindrom {

	public static void main(String[] args) {
		String str = "madam";
		String temp = str;
		String result = "";
		char[] arr = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i];
		}
		if (result.equals(str)) {
			System.out.println("string is palindrom");
		} else {
			System.out.println("string is NOT palindrom");
		}
	}

}
