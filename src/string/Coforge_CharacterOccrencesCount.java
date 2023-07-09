package string;

import java.util.HashMap;
import java.util.Map;

public class Coforge_CharacterOccrencesCount {

	public static void main(String[] args) {
		String str = "anand1234tajne";
		str = str.replaceAll("[0-9]", "");
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

		// filter the date
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("char : " + entry.getKey() + " count : " + entry.getValue());
			}
		}
	}
}