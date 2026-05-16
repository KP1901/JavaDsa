package Collection_05.Module_04;

import java.util.*;

public class MapBasics_01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

//		put -> insert key-value pairs
		map.put("in", "India");
		map.put("us", "United Stated");
		map.put("en", "England");

		System.out.println(map);

//		putAll

		Map<String, String> table = new HashMap<>();
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

MAP

- Stores data in key-value pairs
- Keys must be unique
- Values can be duplicate
- Part of Collection Framework
- Child implementations:
  HashMap
  LinkedHashMap
  TreeMap

Most Used Methods:
put()
get()
remove()
containsKey()
containsValue()
keySet()
values()
entrySet()
getOrDefault()
putIfAbsent()
replace()
size()
isEmpty()
clear()
forEach()


Applications:
- Fast lookup
- Data mapping
- Database indexing
- Caching


 */
