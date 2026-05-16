package Collection_05.Module_04;

import java.util.*;

public class LinkedHashmap_02 {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();

//		put -> insert key-value pairs
		map.put("in", "India");
		map.put("us", "United Stated");
		map.put("en", "England");

		System.out.println(map);

//		putAll

		Map<String, String> table = new LinkedHashMap<>();
		table.put("br", "Brazil");

		System.out.println("before " + table);

		table.putAll(map);
		System.out.println("after " + table);

//		remove

		table.remove("en");
		System.out.println(table);

//		size
		System.out.println(table.size());

//		putIfAbsence
		table.putIfAbsent("en", "England");
		System.out.println(table);

//		get
		System.out.println(table.get("br"));

//		getorDefulat
		System.out.println(table.getOrDefault("USA", "None"));

//      containsKey
		System.out.println(table.containsKey("USA"));

//      containsValue
		System.out.println(table.containsValue("Brazil"));

//		replace
		table.replace("br", "BRAZIL");
		System.out.println(table);

//      keySet
		Set<String> keySet = table.keySet();
		System.out.println(keySet);

//		iterate over keyset
		for (String x : table.keySet()) {
			System.out.println(x);
		}

//		valueSet
		Collection<String> valueSet = table.values();
		System.out.println(valueSet);

//		entries of map
		Set<Map.Entry<String, String>> entriesOfPair = table.entrySet();
		System.out.println(entriesOfPair);

//		iterate over entries
		for (Map.Entry<String, String> x : table.entrySet()) {
			System.out.println(x);
		}

//		clear
		table.clear();

	}
}
/*

LINKEDHASHMAP

- Stores data in key-value pairs
- Keys must be unique
- Values can be duplicate
- Maintains insertion order
- Allows one null key
- Allows multiple null values
- Slightly slower than HashMap

Internal Working:
- Hash Table + Doubly Linked List

Methods:
All methods of Map
Own methods: removeEldestEntry()


Time Complexity:
put()         -> O(1)
get()         -> O(1)
remove()      -> O(1)
containsKey() -> O(1)

Applications:
- Ordered key-value storage
- Caching (LRU Cache)
- Maintaining insertion order
 */