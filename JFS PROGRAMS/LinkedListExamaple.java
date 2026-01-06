import java.util.*;
public class LinkedListExamaple{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.addFirst(5);
		list.addLast(20);
		list.add(25);
		System.out.println(list);
		list.removeFirst();
		System.out.println("After remove" + list);
	}
}