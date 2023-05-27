package Linkelist;
import java.util.*;
public class RemoveFirstAndLast
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(3);
		list1.add(9);
		list1.add(7);

		System.out.println(list1);
		myCode(list1);
	}
	
	public static void myCode(LinkedList<Integer> list1) 
	{
       list1.removeFirst();
       list1.removeLast();
       System.out.println(list1);
	}
}
