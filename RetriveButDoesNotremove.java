package Linkelist;
import java.util.*;
public class RetriveButDoesNotremove
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
         System.out.println(list1.peekLast()); 
          System.out.println(list1);
	}
}