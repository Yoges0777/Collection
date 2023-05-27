package Linkelist;
import java.util.*;
public class CompareTwoLinkedList 
{

	public static void main(String[] args) 
	{
		LinkedList<String> c1= new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");

		LinkedList<String> c2= new LinkedList<String>();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Orange");

		myCode(c1,c2);
	}
	public static void myCode(LinkedList<String> c1,LinkedList<String> c2) 
	{
		ArrayList<String> a3= new ArrayList<String>();
		for(String s1 : c1)
		{
			a3.add(c2.contains(s1) ? "yes" : "no");
			
		}
		System.out.println(a3);
	}
}