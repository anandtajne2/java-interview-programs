package string_programes;

import java.util.HashMap;
import java.util.Map;

public class FindDublicateCharacterUsingMap {

	public static void main(String[] args) {
		String str = "laptop";
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : arr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		// printing dublicates
		for (Character key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + " : " + map.get(key));
			}
		}
	}

}
