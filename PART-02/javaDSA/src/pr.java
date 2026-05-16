import java.util.*;

public class pr {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(30);
		list.add(20);
		list.add(30);

		Collections.sort(list);
		System.out.println(list);

	}
}
