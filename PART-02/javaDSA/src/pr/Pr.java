package pr;

import java.util.*;

public class Pr {
	public static void main(String[] args) {

		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(6);
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(5);

		System.out.println(p);

//		poll -> remove top/highest priorty element
//		p.poll();
		System.out.println(p);

	}
}

