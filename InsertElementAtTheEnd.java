package Linkelist;
import java.util.*;
public class InsertElementAtTheEnd 
{	
	public class MyClass 
	{
		public static void main(String[] args) 
		{
			LinkedList<Integer> list1=new LinkedList<Integer>();
			list1.add(4);
			list1.add(6);
			list1.add(3);
			list1.add(9);
			list1.add(7);

			int addLast=23;
			System.out.println(list1);
			myCode(list1,addLast);
		}
		public static void myCode(LinkedList<Integer> list1,int addLast) 
		{
           list1.addLast(addLast);
           System.out.println(list1);
		}
	}
}