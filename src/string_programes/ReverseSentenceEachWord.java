package string_programes;

public class ReverseSentenceEachWord {

	public static void main(String[] args) {
		String str = "reverse the sentence word";
		String result = "";
		String[] arr = str.split(" ");

		for (String word : arr) {
			int j = word.length() - 1;
			String reverseWord = "";

			while (j >= 0) {
				char ch = word.charAt(j);
				reverseWord = reverseWord + ch;
				j--;
			}
			result = result + reverseWord + " ";
		}
		System.out.println("result : " + result);
	}
}