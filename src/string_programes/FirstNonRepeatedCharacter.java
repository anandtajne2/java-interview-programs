package string_programes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "swiss";
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : arr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch));
			} else {
				map.put(ch, 1);
			}
		}
		for (char key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.println(key + " : " + map.get(key));
				break;
			}
		}
		// printing using Entry
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
				break;
			}
		}
	}

}
