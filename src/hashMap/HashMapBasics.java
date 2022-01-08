package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {
	/*
	 * Hashmap implements Map interface,clonable and serializable
	 * it does not maintain any ordering
	 * no Order = no indexing
	 * stores value = Key Value Key Cannot be duplicate
	 * Can Store n number of null value but only one null key Hashmap is not
	 * thread safe(Unsynchronized)
	 */

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("USA", "WashingTonDC");
		map1.put("India", "New Delhi");
		map1.put("UK", "London");
		map1.put(null, "Berlin");
		map1.put(null, "LA");

		System.out.println(map1.get("India"));
		System.out.println(map1.get("UK"));
		System.out.println(map1.get(null));

		// Traverse using Iterator
		// On hashmap you cannot apply iterator directly no method available so
		// follow
		// below step
		Iterator<String> it = map1.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map1.get(key);
			System.out.println("Key = " + key + "Value = " + value);
		}
		// Iterate Hasmap using lambda Expression
		map1.forEach((k, v) -> System.out.println("Key = " + k + " value = " + v));
	}
}
