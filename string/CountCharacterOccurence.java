package string;

public class CountCharacterOccurence {

	public static void main(String[] args) {

		String str = "Java is object oriented programming language";

		int result = str.length() - str.replaceAll("o", "").length();
		System.out.println("result : " + result);
	}

}
