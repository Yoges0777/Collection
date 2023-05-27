package Arraylist;

import java.util.*;;


public class ConvertLinkedListToArrayList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(42);
		list1.add(16);
		list1.add(33);
		list1.add(94);
		list1.add(87);

		ArrayList<Integer> al=new ArrayList<Integer>();
		myCode(list1,al);
	}
	public static void myCode(LinkedList<Integer> list1,ArrayList<Integer> al) 
	{
		for (Object i : list1) 
		{
			System.out.println(i);
		}
		
		
		
	}
}