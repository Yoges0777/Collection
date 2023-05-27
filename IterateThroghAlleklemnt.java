package Linkelist;

import java.util.*;
public class IterateThroghAlleklemnt
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
		//EndOfMainMethod
		public static void myCode(LinkedList<Integer> list1) 
		{
			Iterator i=list1.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
	}
