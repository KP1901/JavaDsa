package pr;

import java.util.*;

public class ArrayList_01 {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(1);
		list1.add(2);
		list1.add(4);

		int index = 1;
		int element = list1.get(index);

		for (int i = 0; i < list1.size(); i++) {
			int count = 0;
			for (int j = 0; j < list1.size(); j++) {
				if (list1.get(i) == list1.get(j)) {
					count++;
				}
			}
			System.out.println(i + " -> " + count);
		}

	}
}
