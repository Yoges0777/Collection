package Linkelist;
import java.util.*;
public class IterateLinkedlistdescendingOrder 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);

		myCode(list1);
	}
	public static void myCode(LinkedList<Integer> list1) 
	{
		Iterator<Integer> it = list1.descendingIterator();

		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		Collections.reverse(list1);
		System.out.println(list1);

	}
}
