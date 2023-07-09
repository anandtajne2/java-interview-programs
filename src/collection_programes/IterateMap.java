package collection_programes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "Saket");
		map.put(25, "Saurav");
		map.put(12, "HashMap");
		System.out.println(map.size());
		System.out.println("While Loop:");
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator.next();
			System.out.println("Key is " + entry.getKey() + " value is " + entry.getValue());
		}
		System.out.println("For Loop:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key is : " + entry.getKey() + " Value is : " + entry.getValue());
		}
	}

}
