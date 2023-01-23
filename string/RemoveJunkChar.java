package string;

public class RemoveJunkChar {

	public static void main(String[] args) {
		String str = "*&^&%^&$%^ latin string 77567868";
		str = str.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(str);
	}
}
