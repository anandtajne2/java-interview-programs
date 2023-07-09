package array_programes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class array {

	public static void main(String[] args) {
		String[] names = { "java", "javascript", "java", "ruby", "c", "python", "c" };

		// 1 compare each element : O(nxn) solution
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("dublicate elements : " + names[i]);
				}
			}
		}

		System.out.println("--------------------------");

		// 2. using hash set : java collection it stores unique values O(n)
		Set<String> stores = new HashSet<String>();
		for (String name : names) {
			if (stores.add(name) == false) {
				System.out.println("Set dublicate elements : " + name);
			}
		}

		// 3. using hashmap : O(2n)
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = map.get(name);
			if (count == null) {
				map.put(name, 1);
			} else {
				map.put(name, ++count);
			}
		}
		System.out.println("--------------------------");
		// printing
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("map dublicate element : " + entry.getKey());
			}
		}
	}
	
}