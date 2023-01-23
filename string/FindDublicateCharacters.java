package string;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDublicateCharacters {

	public static void main(String[] args) {
		 String str = "laptop";
		//String str = "aaafffatttt";

		// logic 1 with out using any pre definded method
		char[] charArray = str.toCharArray();
		String result = "";
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					System.out.println("dublicate character in string : " + charArray[j]);
					result = result + charArray[j];
				}
			}
		}
		System.out.println("dublicate char " + result);

		// login 2 using hashmap

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (!map.containsKey(charArray[i])) {
				map.put(charArray[i], 1);
			} else {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			}
		}

//		for (char c : map.keySet()) {
//			System.out.println("dublicate charater : " + c + " count : " + map.get(c));
//		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(" char : " + entry.getKey() + " count : " + entry.getValue());
		}

		// to prin only dublicate
//		for (char c : map.keySet()) {
//			if (map.get(c) > 1) {
//				System.out.println(c + " : " + map.get(c));
//			}
//		}

	}

}