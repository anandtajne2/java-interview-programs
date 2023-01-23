package string;

import java.util.HashMap;

public class CountWords {

	public static void main(String[] args) {
		String str = "I am learning learning java java java programming programming";

		String[] arrayString = str.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		Integer count = 1;

		for (int i = 0; i < arrayString.length; i++) {
			if (!hashMap.containsKey(arrayString[i])) {
				hashMap.put(arrayString[i], count);
			} else {
				hashMap.put(arrayString[i], hashMap.get(arrayString[i]) + count);
			}
		}

		for (String string : hashMap.keySet()) {
			System.out.println("the count of word : " + string + " = " + hashMap.get(string));
		}
	}
}
