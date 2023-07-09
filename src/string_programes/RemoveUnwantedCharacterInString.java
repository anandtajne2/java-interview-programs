package string_programes;

public class RemoveUnwantedCharacterInString {

	public static void main(String[] args) {
		String str = "^&%#ABCDEFG37784";
		str = str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println("remove unwanted characters from string : " + str);
	}

}