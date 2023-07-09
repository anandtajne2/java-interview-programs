package string;

import java.util.HashMap;
import java.util.Map;

public class FindDublicateWordUsingMap {

	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		String[] split = str.split(" ");

		// using string contains method
		System.out.println("using string contains method");
		for (int i = 0; i < split.length; i++) {
			for (int j = i + 1; j < split.length; j++) {
				if (split[i].contains(split[j])) {
					System.out.println("dublicate word : " + split[i]);
				}
			}
		}

		// using hashmap

		Map<String, Integer> map = new HashMap<>();
		for (String word : split) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		// printing map with key and values
		System.out.println(map);

		// filter map with values
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("word : " + entry.getKey() + " count " + entry.getValue());
			}

		}
	}

}
