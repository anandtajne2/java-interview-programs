package string;

public class CountDublicateCharWithNewChar {

	public static void main(String[] args) {
		String str = "aaafffatttt";

		char[] array = str.toCharArray();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]==array[j]) {
					System.out.print(array[i]+" "+ ++count);
				}
				else if (array[i]!=array[j]) {
					count = 0 ;
					System.out.println();
				}
			}
			break;
		}
	}
}