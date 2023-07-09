package extra;

public class ReverseIndividualWordAndFilerNO {

	public static void main(String[] args) {

		String str = "Today10is20my30interview";
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				newStr += str.charAt(i);
			}
			
		}
		System.out.println(newStr);
	}

	private static void reverseWordInMyString(String str) {

		/*
		 * The split() method of String class splits a string in several strings based
		 * on the delimiter passed as an argument to it
		 */

		str = str.replaceAll("[]", "");
		String[] words = str.split("0-9");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {

				/*
				 * The charAt() function returns the character at the given position in a string
				 */
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}
}
