package pr;

import java.util.*;

public class Pr {
	public static void main(String[] args) {

		Stack<Integer> list1 = new Stack<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		list1.push(40);
		list1.pop();
		System.out.println(list1.peek());
		System.out.println(list1);
	}
}