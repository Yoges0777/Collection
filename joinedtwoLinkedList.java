package Linkelist;
import java.util.*;
public class joinedtwoLinkedList
{


	public class MyClass {
		//StartOfMainMethod
		public static void main(String[] args) 
		{
			LinkedList<Integer> list1=new LinkedList<Integer>();
			list1.add(4);
			list1.add(6);
			list1.add(3);
			list1.add(9);
			list1.add(7);

			LinkedList<Integer> list2=new LinkedList<Integer>();
			list2.add(1);
			list2.add(5);
			list2.add(3);
			list2.add(6);
			list2.add(7);

			LinkedList<Integer> list3=new LinkedList<Integer>();
			myCode(list1,list2,list3);
		}
		public static void myCode(LinkedList<Integer> list1,LinkedList<Integer> list2,LinkedList<Integer> list3) 
		{
			list1.addAll(list2);
			System.out.println(list1);
		}

}}