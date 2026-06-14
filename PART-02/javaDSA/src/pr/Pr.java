package pr;

import java.util.*;

public class Pr {
	public static void main(String[] args) {


		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		list.addFirst(100);
		System.out.println(list);

		list.addLast(200);
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

	}
}
