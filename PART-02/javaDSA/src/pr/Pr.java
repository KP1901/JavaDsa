package pr;

import java.util.*;

public class Pr {
	public static void main(String[] args) {

		Deque<Integer> d = new ArrayDeque<>();

		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);


//		queue

//		enter
		d.addFirst(100);
		d.addFirst(200);

		System.out.println(d);

//		remove
		d.removeFirst();
		System.out.println(d);

//		stack

//		add
		d.addLast(400);
		d.addLast(300);
		System.out.println(d);

//		remove
		d.removeLast();
		System.out.println(d);

		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());

	}
}
