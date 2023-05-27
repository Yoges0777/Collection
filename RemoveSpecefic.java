package Linkelist;
import java.util.*;
public class RemoveSpecefic 
{

		public static void main(String[] args) 
		{
			LinkedList<Integer> list1=new LinkedList<Integer>();
			list1.add(4);
			list1.add(6);
			list1.add(3);
			list1.add(9);
			list1.add(7);
			int index=2;
			System.out.println(list1);
			myCode(list1,index);
		}
		//EndOfMainMethod
		public static void myCode(LinkedList<Integer> list1,int index) 
		{
			list1.remove(index);
			System.out.println(list1);
	}
}